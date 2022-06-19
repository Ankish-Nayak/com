package com.ankish;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your rollNo");
        int rollNo = input.nextInt();
        System.out.println("Enter you are rollno  is  " + rollNo);
        String name = input.next();
        System.out.println(name);
        float numbers = input.nextFloat();
    }
}