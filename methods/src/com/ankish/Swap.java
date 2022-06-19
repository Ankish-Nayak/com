package com.ankish;

public class Swap {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        System.out.println(a + ", " +b);
        swap( a, b); // there would not be any swapping
        // as java does not allow pass by reference it only, allow pass by value
        // swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;
        System.out.println(a + ", " + b);
    }
    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
}