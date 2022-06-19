package com.ankish;

import java.util.Arrays;

// we use variable length argument when we are not aware of number of argument we want, and internally
// it takes arguments in array

public class VarArgs {
    public static void main(String[] args){
//        fun( 3, 3, 34, 2, 23, 343, 3);
//        multiple( 1, 3, "Ankish", "Nayak", "Arjun", "Anyuj");
        demo( 1, 2, 3, 4, 5, 3);
        demo( "Ankish", "Nayak", "Ajai");
        // demo(); will produce error because at compile time compiler would not be able to decide to choose which function
    }
    // function overloading in varArgs
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    // variable length argument must come at the last of parameter
    static void multiple(int a,int b,String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v){
        // internally it takes arguments in array
        System.out.println(Arrays.toString(v));
    }
}