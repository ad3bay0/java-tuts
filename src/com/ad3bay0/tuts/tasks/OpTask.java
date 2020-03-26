package com.ad3bay0.tuts.tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

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

   /**
    * 
    * @param size
    * @param rangeBegining
    * @param rangeEnding
    * @return array of integers 
    */
    public static int[] generateNnumberOfIntegerArray(int size,int rangeBegining,int rangeEnding){

        return new Random().ints(size,rangeBegining,rangeEnding).toArray();

    }

    public static int solution(int[] A){

        int ans = 20;

        System.out.println("test case: "+20);
        for(int i = 1;i<A.length;i++){
            
            if(ans > A[i]){

                ans = A[i];
            }

        }

        return ans;
    }
}