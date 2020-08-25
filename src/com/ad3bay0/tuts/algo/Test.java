package com.ad3bay0.tuts.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {


   public static void main(String[] args) {

      System.out.println(reverseArray(Arrays.asList(1,2,3,4,5)).toString());
  }

  public static int floor(float a, float b){

    Double sum = Double.sum(a, b);

    System.out.println(sum);

    return sum.intValue();
  }

  public static List<Integer> reverseArray(List<Integer> arr){

    List<Integer> arrList =  new ArrayList<>();

    for(int i = arr.size()-1; i>=0; i--){

        arrList.add(arr.get(i));

    }

    return arrList;
  }
    
}