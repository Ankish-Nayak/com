package com.ankish.Practice;

import java.util.Scanner;

public class ArmstrongFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter left");
        int l = input.nextInt();
        System.out.println("Enter right");
        int r = input.nextInt();
        for(int i = l; i<=r; ++i){
            int n = i;
            int d = 0;
            while(n > 0){
                int t = n % 10;
                n /= 10;
                d += (t * t * t);
            }
            if(i == d){
                System.out.println(i);
            }
        }
    }
}