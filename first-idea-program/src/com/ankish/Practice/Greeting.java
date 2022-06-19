package com.ankish.Practice;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name");
        String s = input.nextLine();
        System.out.println("Hey, " + s);
    }
}
