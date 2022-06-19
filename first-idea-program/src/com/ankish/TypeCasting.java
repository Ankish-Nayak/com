package com.ankish;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        float num = input.nextFloat(); // taking float as input
//        float num = input.nextInt(); // implicit type conversion is taking place here
//        System.out.println(num);

        // typecasting : explicit conversion
//        int num1 = (int) (67.343f); // here float value is converted to int
//        System.out.println(num1);

        // automatic type promotion in expressions
//        int a = 257;
//        // here byte can not store integer value 257 therefore it will take mod with range of byte
//        byte b = (byte) (a) ; // 257 % 256 = 1
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        // can assign this to int
//        int d = a * b / c;
//        System.out.println(d);

//        byte b = 50;
//        b = b * 2; // cannot assign int to byte

//        int number = 'A'; // automatic type conversion
//        System.out.println(number);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.5645f;
        double d = 0.3434;
        double result = (f*d) + (i/c) - (d*s);
        // float + int - double = double
        System.out.println((f*d) + ", " +(i/c) + ", " + (d*s));
        System.out.println(result);

        System.out.println(3*6);
        System.out.println(4 * 4.3434f);
    }
}