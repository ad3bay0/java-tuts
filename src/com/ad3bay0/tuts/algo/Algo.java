package com.ad3bay0.tuts.algo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Algo {

    private static final int DEFAULT_PART= 3;

    public static void main(String[] args) {

        // int[] nums = { 1, 2, 3, 4, 5, 6 };
        // sumInAnArray(nums, 9);

        solution(10, new int[] { 1, 2, 1, 1 }, new int[] { 1, 4, 3, 2, 4 });
        // System.out.println(maximumPair(10, new int[]{1,2,1,1,3}, new
        // int[]{1,4,3,2,4}));

    }

    /*
     * 
     * 
     * Given an array of integers, return indices of the two numbers such that they
     * add up to a specific target.
     * 
     * You may assume that each input would have exactly one solution, and you may
     * not use the same element twice.
     */
    public static int[] sumInAnArray(int[] nums, int targets) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                int sum = nums[i] + nums[j];
                System.out.println(nums[i] + " + " + nums[j] + " = " + sum);
                System.out.println();

                if (sum == targets) {

                    System.out.println("[" + nums[i] + "],[" + nums[j] + "]");

                    return new int[] { i, j };

                }

            }

        }

        throw new IllegalArgumentException("no 2 sum in the array provided");

    }


    public static int solution(int noOfWashes, int[] cleanPile, int[] dirtyPile) {

        int pair = 0; //initialize the pair count

        Set<Integer> unpairedCleanSocks = new HashSet<>();//create Set to include unpaired clean socks
       
        System.out.println("clean pile: "+Arrays.toString(cleanPile));
        System.out.println("dirty pile: "+Arrays.toString(dirtyPile));

        for (int cleanSock : cleanPile) {

           

            if(!unpairedCleanSocks.remove(cleanSock)){
                System.out.println("cleanSock added to unpair: "+cleanSock);
                unpairedCleanSocks.add(cleanSock);

            }else{

                pair += 1;
                
            }

        }

        unpairedCleanSocks.forEach(x->{

            System.out.print(x);
            System.out.println("");
        });

        //check if the washing machine is capable of washing if not return the pai availabel
        if (noOfWashes<=0){
        
            return pair;
        }

        //sort dirty socks into color and count
        Map<Integer,Integer> dirtySocks = new HashMap<>();

        for(int color:dirtyPile){

            if(dirtySocks.containsKey(color)){

                dirtySocks.put(color, dirtySocks.get(color) +1);

            }else{

                dirtySocks.put(color, 1);
            }

        }

        dirtySocks.forEach((k,v)->{
            System.out.println(k+"-"+v);
        });




        for(int color: unpairedCleanSocks){

            if(dirtySocks.containsKey(color) && dirtySocks.get(color)>0){

                dirtySocks.put(color, dirtySocks.get(color)  - 1);
                
                //pair found
                pair +=1;
            
                noOfWashes -= 1;

                if(noOfWashes == 0){

                    return pair;
                }

            }

        }

        for(int count: dirtySocks.values()){

            int socks = Math.min(count/2, noOfWashes/2);

            noOfWashes -= socks * 2;

            pair += socks;

            if(noOfWashes <=1){

                return pair;

            }

        }

        return pair;

    }



    public int solution(String s){

        
        int count[] = new int[26]; 
  
        for (int i = 0; i < s.length(); i++) 
            count[s.charAt(i) - 'a']++;  
            count[s.charAt(0) - 'a'] = 1; 
      
        
        int ways = 1; 
        for (int i = 0; i < 26; ++i) 
            if (count[i] != 0) 
                ways *= count[i]; 
      
        return ways; 
}