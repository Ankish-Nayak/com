package com.ankish;

import java.util.Arrays;
/// Remember java only allow pass by value
public class PassingFunctions {
    public static void main(String[] args) {
         int[] nums = { 1, 2, 3, 10};
         System.out.println(Arrays.toString(nums));
         // here copy of reference variable is passed
         change(nums);
         System.out.println(Arrays.toString(nums));
    }
    static void change(int[] nums){
        nums[2] = 2;
    }
}