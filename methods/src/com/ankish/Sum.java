package com.ankish;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        sum();
        System.out.println(sum2());
        System.out.println(sum3(343,4343));
    }
    static int sum2(){
         Scanner input = new Scanner(System.in);
         System.out.println("Enter num1 : ");
         int num1 = input.nextInt();
         System.out.println("Enter num2 : ");
         int num2 = input.nextInt();
         return num1 + num2;
    }
    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = input.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = input.nextInt();
        System.out.println(num1 + num2);
    }
    static int sum3(int num1,int num2){
        return num1 + num2;
    }
}
