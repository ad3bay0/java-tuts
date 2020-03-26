package com.ad3bay0.tuts.tasks;

import java.util.HashMap;
import java.util.Map;

/**
 * OpTask
 */
public class OpTask {

    private OpTask(){

    }
   public static void parseByValueCheck(int x, int y, int m) {

        if (x == 5) {

            m = y;

        } else {
            m = x;
        }
    }

    public static void substringCalculator(String s) {

        Map<String, Integer> store = new HashMap<>();

        int counter = 0;
        for (int i = 0; i < s.length(); i++) {

            String subString = s.substring(i);

            for (int j = 0; j < subString.length(); j++) {

                String distinctSubstrings = subString.substring(0, subString.length() - 1);

                if (!store.containsKey(distinctSubstrings)) {

                    store.put(distinctSubstrings, 1);
                    System.out.println(distinctSubstrings);
                    counter += 1;

                }
                else{

                    continue;
                }
            }

        }

    }
}