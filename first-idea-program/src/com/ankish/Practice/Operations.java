package com.ankish.Practice;

import java.util.Objects;
import java.util.Scanner;

public class Operations {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter second number");
        int num2 = input.nextInt();
        System.out.println("Enter which operations you want");
        String operator = input.next();
        System.out.println("Result is");
        if(Objects.equals(operator, "+")){
            System.out.println(num1 + num2);
        }else if(Objects.equals(operator, "-")){
            System.out.println(num1-num2);
        }else if(Objects.equals(operator, "*")){
            System.out.println(num1 * num2);
        }else if(Objects.equals( operator, "/")){
            System.out.println(num1 / num2);
        }else{
            System.out.println("Invalid input");
        }
    }
}