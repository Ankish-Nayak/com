package com.ankish;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args){
        int[] arr = { 1, 3, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        change(arr); // here reference is being passed by call by value
        // java does not allow call by reference
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[3] = 34;
    }
}