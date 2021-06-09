package com.ad3bay0.tuts.algo;

public class Challenge {

    public static void main(String[] args) {

        System.out.println(MissingDigit("4 - 2 = X"));
    }

    public static String MissingDigit(String str) {
        // code goes here  
      
     
  String[] formulaArray = str.split(" ");

  String firstOp = formulaArray[0];
  String operator = formulaArray[1];
  String secondOp = formulaArray[2];
  String answer = formulaArray[3]; 

  int intValfirstOp = Integer.valueOf(firstOp);
  int intValSecondOp = Integer.valueOf(secondOp);
  int intValAnswer = Integer.valueOf(answer);






  return String.valueOf(xInResult(intValfirstOp, intValSecondOp, operator));
      }

    public static int xInResult(int intValfirstOp, int intValSecondOp, String operator) {

        int result = 0;

        switch (operator) {

            case "+":
                result = intValfirstOp + intValSecondOp;
                break;

            case "-":
                result = intValfirstOp - intValSecondOp;
                break;

            case "*":
                result = intValfirstOp * intValSecondOp;
                break;
            case "/":
                result = intValfirstOp / intValSecondOp;
                break;

        }

        return result;

    }

    public static int xInFirstOperand(int intValSecondOp, int intValAnswer, String operator) {

        int result =  0;

        switch (operator) {

            case "+":
                result = intValAnswer - intValSecondOp;
                break;

            case "-":
                result = intValAnswer + intValSecondOp;
                break;

            case "*":
                result = intValAnswer / intValSecondOp;
                break;
            case "/":
                result = intValAnswer * intValSecondOp;
                break;

        }

        return result;

    }

    public static int xInSecondOperand(int intValfirstOp, int intValAnswer, String operator) {

        int result = 0;

        switch (operator) {

            case "+":
                result = intValAnswer - intValfirstOp;
                break;

            case "-":
                result = intValAnswer + intValfirstOp;
                break;

            case "*":
                result = intValAnswer / intValfirstOp;
                break;
            case "/":
                result = intValAnswer * intValfirstOp;
                break;

        }

        return result;

    }

    
}
