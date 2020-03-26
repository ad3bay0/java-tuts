package com.ad3bay0.tuts.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.ad3bay0.tuts.builderpattern.Student;
import com.ad3bay0.tuts.tasks.OpTask;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        testBuilderPattern();
        testParsebyValye();
        testSubstringBuilder("tester");
        testRandomIntegerArrayBySize(10,1,5);

        testSolution();
        
    }

    static void testParsebyValye(){
        int i = 6, j = 5, k = 8;

        OpTask.parseByValueCheck(i, j, k);

        System.out.println(k);
    }

    static void testSubstringBuilder(String testValue){

        OpTask.substringCalculator(testValue);
    }


    static void testBuilderPattern(){

        Student std =  new Student.SimpleStudentBuilder()
        .setId(1)
        .setName("adebayo")
        .setMajor("hnd")
        .setMobileNumber("03994958848")
        .build();
        System.out.println(std.getName());
    }
 
    static void  testRandomIntegerArrayBySize(int size,int from,int to){

      List<Integer> listOfInt =  Arrays.stream(OpTask.generateNnumberOfIntegerArray(size,from,to)).boxed().collect(Collectors.toList());

      listOfInt.forEach(e->System.out.println(e));
      
    }

    static void testSolution(){


        int[] numbers = OpTask.
        generateNnumberOfIntegerArray(4, 1, 40);

        System.out.println(Arrays.toString(numbers));
        int result = OpTask
        .solution(numbers);
        System.out.println("result: "+result);
    }
    
   
    
}