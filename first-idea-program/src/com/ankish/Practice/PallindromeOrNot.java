package com.ankish.Practice;

import java.util.Scanner;

public class PallindromeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string");
        String s = input.next();
        boolean pallin = true;
        int n = s.length();
        for(int i = 0; i<n/2; ++i){
            if(s.charAt(i) != s.charAt(n-1-i)){
                pallin = false;
                break;
            }
        }
        if(pallin){
            System.out.println("Yes Pallindrome");
        }else{
            System.out.println("Not Pallindrome");
        }
    }
}