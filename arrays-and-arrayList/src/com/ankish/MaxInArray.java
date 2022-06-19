package com.ankish;

public class MaxInArray {
    public static void main(String[] args){
        int[] arr = { 1, 231, 232, 34, 2};
        System.out.println(maxElement(arr));
        System.out.println(maxInRange( arr, 0, 2));
    }
    static int maxInRange(int[] arr,int l,int r){
        int maxVal = arr[l];
        for(int i = l; i<=r; ++i){
            if(maxVal < arr[i]){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    static int maxElement(int[] arr) {
        int max = arr[0];
        for(int i = 0; i<arr.length; ++i){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}