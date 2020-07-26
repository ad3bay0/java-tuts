package com.ad3bay0.tuts.memory;

/**
 * PassByValue
 */
public class PassByValue {




    public static void main(String[] args) {
     
        StringBuilder teacher = new StringBuilder("Adebayo");
        String course = "Java";

        buildClass(teacher,course);

        System.out.println("Course: "+course+" taken by "+teacher);


    }

    static void buildClass(StringBuilder teacher, String course){
teacher.append("Adeniyan");
course = course+" EE";

teacher = null;
course = null;

    }

    static void transformHomer(Simpson simpson){
        simpson.name = "Homer";

    }

    static void transformHomer(StringBuilder simpson){
       simpson.append("bART");


    }

    static void transformHomer(String simpson){
        simpson = "Bart";
 
 
     }

    static void changeHomerAge(int homerAge){
          
        homerAge = 35;    
    }
    

    
}

 class Simpson{

    String name;
}