package com.ankish;

public class Shadowing {
    static int x = 10;
    public static void main(String[] args) {
        System.out.println(x);
        int x;
//        System.out.println(x);  // scope begins when value is initialised
        // the value of x is being shadowed
        x = 20;
        System.out.println(x);
        fun();
    }
    static void fun(){
        // no shadowing
        System.out.println(x);
    }
}