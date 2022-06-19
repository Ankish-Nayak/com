package com.ankish.Practice;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ruppes");
        int num = input.nextInt();
        System.out.println("USD are: "+(num*79));
    }
}
