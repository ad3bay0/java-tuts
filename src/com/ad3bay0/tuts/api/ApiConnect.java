package com.ad3bay0.tuts.api;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ApiConnect {

    private static final String BASE_URL = "https://jsonmock.hackerrank.com/api/transactions/search?userId=";

    public static void main(String[] args) throws Exception {

        System.out.println(getTransactionn(2, 8, 5, 50));

    }

    public static Map convertJsonResponseToMap(String jsonString) throws ScriptException {

        String java2json = "Java.asJSONCompatible(" + jsonString + ")";
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("javascript");
        return (Map) scriptEngine.eval(java2json);
    }

    public static int retrieveData(int userId, int locationId, int netStart, int netEnd) throws Exception {
        int numberOfPages = getPages(userId);
        int amount = 0;

        if (numberOfPages > 0) {
            IntStream stream = IntStream.rangeClosed(1, numberOfPages);
            Stream<Map> allData = stream.mapToObj(i -> getDataByPage(userId, i)).flatMap(List::stream);
            amount = allData.filter(x -> isValidData(x, netStart, netEnd, locationId))
                    .mapToInt(x -> getAmountFromData(x)).sum();

        }

        return amount;

    }

    private static int getAmountFromData(Map x) {
        int intRoundedAmount = 0;
        try {
            String stringValueOfAmount = x.get("amount").toString();
            double doubleValueOfAmount  = NumberFormat.getCurrencyInstance(Locale.US).parse(stringValueOfAmount).doubleValue();
            intRoundedAmount = (int) Math
                    .round(doubleValueOfAmount);

                    System.out.println(stringValueOfAmount+"-"+doubleValueOfAmount+"-"+intRoundedAmount);
        } catch (ParseException e) {

        }

        return intRoundedAmount;
    }

    public static boolean isValidData(Map obj, int netStart, int netEnd, int location) {

        boolean isValidIpRange = isInValidIpRange(netStart, netEnd, getFirstByteOfIp(obj.get("ip").toString()));

        int locationIdFromObj = Integer.valueOf(((Map) obj.get("location")).get("id").toString());

        boolean isValidLocation = isInValidLocation(locationIdFromObj, location);

        return isValidIpRange && isValidLocation;

    }

    public static boolean isInValidLocation(int id, int locationId) {

        return id == locationId;
    }

    public static boolean isInValidIpRange(int netStart, int netEnd, int firstIpByte) {

        return IntStream.rangeClosed(netStart, netEnd).boxed().collect(Collectors.toList()).contains(firstIpByte);
    }

    public static int getFirstByteOfIp(String ip) {

        String[] splitIp = ip.split("\\.");

        return Integer.parseInt(splitIp[0]);
    }

    public static List<Map> getDataByPage(int userId, int pageNum) {
        Map result;
        try {
            result = retreveDataFromUri(BASE_URL + userId + "&page=" + pageNum);
            return (List<Map>) result.get("data");
        } catch (Exception e) {

        }
        return new ArrayList<>();
    }

    public static int getPages(int userId) throws Exception {
        Map result = retreveDataFromUri(BASE_URL + userId);
        return (int) result.get("total_pages");

    }

    public static Map retreveDataFromUri(String urlString) throws Exception {

        Map result = new HashMap<>();
        URL url = new URL(urlString);
        StringBuffer content = new StringBuffer();

        try (InputStream is = url.openStream(); BufferedReader in = new BufferedReader(new InputStreamReader(is))) {

            String inputline;

            while ((inputline = in.readLine()) != null) {

                content.append(inputline);

            }

            result = convertJsonResponseToMap(content.toString());
        }

        return result;
    }

    public static int getTransactionn(int userId, int locationId, int netStart, int netEnd) throws Exception {

        return retrieveData(userId, locationId, netStart, netEnd);
    }

}