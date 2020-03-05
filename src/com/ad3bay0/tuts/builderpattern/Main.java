package com.ad3bay0.tuts.builderpattern;

/**
 * Main
 */
public class Main {


    public static void main(String[] args) {
        
        Student std =  new Student.SimpleStudentBuilder()
        .setId(1)
        .setName("adebayo")
        .setMajor("hnd")
        .build();
        System.out.println(std.getName());
    }
    
}