package com.nikhil.java;
import com.nikhil.basic.example.Utils;



public class JavaTest {
    public void kotlinStaticFunction(){
        //before @file:JvmName("Util")
       //int max =FunctionExampleKt.max(40,50);
        //after
        int max =Utils.max(40,50);
       System.out.println("max = "+max);
    }
}
