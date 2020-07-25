package com.ad3bay0.tuts.memory;

public class Memory {

    public static void main(String[] args){

        int i = 1;
        Object obj =  new Object();
        Memory mem =  new Memory();
        mem.foo(obj);

    }

    public void foo(Object param){
        String objString =  param.toString();
        System.out.println(objString);
    }
    
}