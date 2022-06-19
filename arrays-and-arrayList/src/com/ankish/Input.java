package com.ankish;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // arrays of primitives
//        int[] arr = new int[5];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 3;
//        arr[4] = 4;
//        System.out.println(Arrays.toString(arr));
//
//        for(int i = 0; i<arr.length; ++i){
//            System.out.println(arr[i]);
//        }

        // Array of Objects
        String[] str = new String[5];
        for(int i = 0; i < str.length; ++i){
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));
    }
}