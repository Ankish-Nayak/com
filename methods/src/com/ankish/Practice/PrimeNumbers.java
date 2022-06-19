package com.ankish.Practice;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        int r = input.nextInt();
        for(int i = l; i<=r; ++i){
            if(isPrime(i)){
                System.out.println(i+", is a prime number");
            }
        }
    }
    static boolean isPrime(int n) {
        if(n <= 1){
            return false;
        }
        for(int i = 2; i*i <= n; ++i){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
