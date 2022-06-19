package com.ankish;

// Function Overloading: Functions with same name with different type of arguments
// Function Overloading is determined at compile time.

public class Overloading {
    public static void main(String[] args) {
        fun(9);
        System.out.println(sum( 1, 2));
        System.out.println(sum( 1, 2, 3));
//        fun("Ankish");
    }
    static int sum(int a,int b){
        return a + b;
    }
    static int sum(int a,int b,int c){
        return a + b + c;
    }
    static void fun(int n){
        System.out.println(n);
    }
    static void fun(String name){
        System.out.println(name);
    }
}