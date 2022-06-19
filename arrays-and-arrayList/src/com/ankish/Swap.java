package com.ankish;

import java.util.Arrays;

public class Swap{
    public static void main(String[] args) {
        int[] arr = { 1, 12, 223, 23};
        System.out.println(Arrays.toString(arr));
        swap( arr, 0, 3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}