package com.ankish.Practice;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = input.nextInt();
        if(n == 1){
            System.out.println(0);
        }else if(n == 2){
            System.out.println(0);
            System.out.println(1);
        }else{
            int a = 0;
            int b = 1;
            System.out.println(a);
            System.out.println(b);
            int c;
            for(int i = 2; i<n; ++i){
                c = a + b;
                System.out.println(c);
                a = b;
                b = c;
            }
        }
    }
}