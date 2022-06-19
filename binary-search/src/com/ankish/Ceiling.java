package com.ankish;

public class Ceiling {
    public static void main(String[] args) {
        int[] a = { 2, 3, 4, 5, 9, 14, 16, 18};
        System.out.println(ceiling( a, 14));
        System.out.println(ceiling( a, 2));
        System.out.println( ceiling( a, 6));
    }
    // greater than or equal to target element
    static int ceiling(int[] a,int target) {
        int l = -1;
        int r = a.length;
        int mid;
        while(r > l+1) {
            mid = l + (r-l)/2;
            if(a[mid] >= target) {
                r = mid;
            }else {
                l = mid;
            }
        }
        return r;
    }
}