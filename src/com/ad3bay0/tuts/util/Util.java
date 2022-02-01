package com.ad3bay0.tuts.util;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Base64;

import javax.xml.crypto.Data;

public class Util {

    public static void main(String[] args) throws Exception {

       String amount = centsInLongToEuros(1000000L);

       System.out.println(amount.equals("10000"));
    }

    public static String convertStringtoBase64String(String data) throws UnsupportedEncodingException {

      return Base64.getEncoder().encodeToString(data.getBytes("utf-8"));
    }

    public static String centsInLongToEuros(Long amount){

     BigDecimal decAmount = new BigDecimal(amount).movePointLeft(2).stripTrailingZeros();

      System.out.println(String.format("amountInCents: %s | amountInEuros: %s  MISC: %S",amount,decAmount.toPlainString(),new BigDecimal(amount).movePointLeft(2)));

      return decAmount.toPlainString();

    }

}
