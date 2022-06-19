package com.ankish;

import java.util.Scanner;


public class Loops {
    public static void main(String[] args){
//        Repetition of certain task
        for(int num = 1; num < 10; ++num) {
            System.out.println(num);
        }
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i<n; ++i){
            System.out.println(i);
        }
    }
}