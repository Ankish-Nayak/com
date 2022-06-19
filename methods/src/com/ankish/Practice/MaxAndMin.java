package com.ankish.Practice;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println(Max( a, b, c));
        System.out.println(Min( a, b, c));
    }
    static int Max(int a,int b,int c){
        if(a >= b && a >= c){
            return a;
        }
        if(b >= c && b >= a){
            return b;
        }
        return c;
    }
    static int Min(int a,int b,int c){
        if(c <= a && c <= b) {
            return c;
        }
        if(b <= a && b <= c) {
            return b;
        }
        return a;
    }
}