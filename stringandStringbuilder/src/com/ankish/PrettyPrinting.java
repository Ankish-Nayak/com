package com.ankish;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 34.343443f;
        System.out.printf("Formatted number is %.2f",a);
        System.out.println();
        System.out.println(Math.PI);
        System.out.printf("Formatted number is %.3f",Math.PI);
        System.out.printf("My name is %s, and I am doing %s","Ankish","coding");
    }
}
