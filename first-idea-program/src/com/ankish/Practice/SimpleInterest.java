package com.ankish.Practice;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float principle, rate;
        int time;
        System.out.println("Enter Principle: ");
        principle = input.nextFloat();
        System.out.println("Enter Rate: ");
        rate = input.nextFloat();
        System.out.println("Enter Time:");
        time = input.nextInt();
        float amount;
        amount = (principle * rate * time) / 100;
        System.out.println("The amount is " + amount);
    }
}
