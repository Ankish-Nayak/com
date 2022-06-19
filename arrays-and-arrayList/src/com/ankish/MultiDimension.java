package com.ankish;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
//        int[][] arr = new int[3][3];
//        int[][] arr = {
//                { 1, 2, 3},
//                { 4, 5, 6},
//                { 7, 8, 9}
//        };
//        for(int i = 0; i<arr.length; ++i){
//            System.out.println(Arrays.toString(arr[i]));
//        }

        int[][] arr = new int[3][3];

        // input
        Scanner input = new Scanner(System.in);
        for(int row = 0; row < 3; ++row){
            for(int col = 0; col < 3; ++col){
                arr[row][col] = input.nextInt();
            }
        }

        // printing
//        for(int row = 0; row < 3; ++row){
//            for(int col = 0; col < 3; ++col){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
//        for(int row = 0; row < 3; ++row) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}