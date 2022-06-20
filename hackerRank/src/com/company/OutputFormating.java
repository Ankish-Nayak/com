package com.company;

import java.util.Scanner;

public class OutputFormating {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0; i<3; ++i){
            String word = sc.next();
            int num = sc.nextInt();
            String sNum = String.valueOf(num);
            int len = sNum.length();
            for(int j = 0; j<(3-len); ++j){
                sNum = "0"+sNum;
            }
            len = word.length();
            for(int j = 0; j<(15-len); ++j){
                word = word + " ";
            }
            System.out.printf("%s%s",word,sNum);
            System.out.println();
        }
        System.out.println("================================");
    }
}
