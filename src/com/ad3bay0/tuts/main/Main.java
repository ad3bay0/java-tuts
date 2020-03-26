package com.ad3bay0.tuts.main;

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

 

    
    
}