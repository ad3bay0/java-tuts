package com.ad3bay0.tuts.algo;

public class Algo {


    public static void main(String[] args) {


        int[] nums = {1,2,3,4,5,6};
        sumInAnArray(nums, 9);
        
    }

    /*

    
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
    */
    public static int[] sumInAnArray(int[] nums, int targets) {

        for(int i = 0; i < nums.length;i++){

            for(int j = i + 1;j<nums.length;j++){

                int sum  = nums[i]+nums[j];
                System.out.println(nums[i]+" + "+nums[j]+" = "+sum);
                System.out.println();

                if(sum==targets){
                    
                    System.out.println("["+nums[i]+"],["+nums[j]+"]");

                    return new int[]{i,j};

                }


            }




        }

        throw new IllegalArgumentException("no 2 sum in the array provided");
        
    }

}