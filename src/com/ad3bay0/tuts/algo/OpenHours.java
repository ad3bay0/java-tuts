package com.ad3bay0.tuts.algo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * OpenHours
 */
public class OpenHours {

    public static void main(String[] args)  throws Exception{


        //String json = readFromFileJava8("test.json");
        
        //ObjectMapper mapper =  new ObjectMapper();

        //Data chdata = mapper.readValue(json, Data.class);

        //System.out.println(chdata.getData().size());

        //String hour = LocalTime.parse("32400",DateTimeFormatter.ofPattern("ss", Locale.getDefault())).format(DateTimeFormatter.ofPattern("HH:mm"));
System.out.println("Parsed Date " +LocalTime.ofSecondOfDay(32400).format(DateTimeFormatter.ofPattern("h.mm a")));


    
    }

    public static String readFromFile(String filePath) throws Exception{

        StringBuilder result =  new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            while((line = br.readLine())!= null){

                result.append(line).append("\n");

            }
            
        } 

        return result.toString();
    }

    public static String readFromFileJava8(String filePath) throws Exception{

        StringBuilder builder = new StringBuilder();
        
      try ( Stream<String> lines = Files.lines(Paths.get(filePath))) {
          
        String data = lines.collect(Collectors.joining("\n"));

        builder.append(data);

      }

        return builder.toString(); 
    }

   

    public static String readFromInputStream(InputStream inputStream) throws Exception{

        StringBuilder result =  new StringBuilder();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {

            String line;

            while((line=br.readLine())!=null){

                result.append(line).append("\n");
            }
            
        }



      return  result.toString();
    }


    public static String readFromResources(String path) throws Exception {


        Class clz =  OpenHours.class;

        InputStream inputStream =  clz.getClassLoader().getResourceAsStream(path);

     return readFromInputStream(inputStream);

        
    }

 /**
  * InnerOpenHours
  */
 static class Status {
 
     private String type;
     private int values;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getValues() {
        return values;
    }
    public void setValues(int values) {
        this.values = values;
    }
     
 }

 static class Weekday {
 
    private List<Status> statuses;

    public List<Status> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }

    
}

static class Data {
 
    Map<String, Weekday> data;

    public Map<String, Weekday> getData() {
        return data;
    }

    public void setData(Map<String, Weekday> data) {
        this.data = data;
    }

    

    
}
}