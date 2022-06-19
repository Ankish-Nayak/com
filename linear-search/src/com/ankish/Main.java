package com.ankish;

public class Main {
    public static void main(String[] args){
        int[] nums = { 12, 23, 3434, 23, 2, 34, 343, 3};
        System.out.println(linearSearch( nums, 2));
        System.out.println(linearSearch( nums, 3));
    }
    static int linearSearch(int[] a,int target) {
        if(a.length == 0){
            return -1;
        }
        for(int i = 0; i<a.length; ++i) {
            if(a[i] == target) {
                return i;
            }
        }
        return -1;
    }
}