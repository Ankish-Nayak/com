package com.company;

import java.util.Scanner;

public class LoopII {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a, b, n;
        while(t-- > 0){
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            int temp = 0;
            for(int i = 0; i<n; ++i){
                temp += b*Math.pow(2,i);
                System.out.print((a + temp)+" ");
            }
            System.out.println();
        }
    }
}
