package com.ad3bay0.tuts.oop;

public class Overriding {

    public static void main(String[] args) {
        Hound hound = new Hound();
       Dog g = hound;
       g.bark();
    }
    
}

class Dog{

    public void bark(){

        System.out.println("bowl");

    }
}

class Hound extends Dog{

    public void bark(){
        System.out.println("growl");
    }

    public void sniff(){
        System.out.println("sniff");
    }

}