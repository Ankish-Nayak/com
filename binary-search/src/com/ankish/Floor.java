package com.ankish;

public class Floor {
    public static void main(String[] args) {
        int[] a = { 2, 3, 5, 9, 14, 16, 18};
        System.out.println(floor( a, 4));
        System.out.println(floor( a, 5));
        System.out.println(floor( a, 15));
        System.out.println(floor( a, 14));
    }
    static int floor(int[] a,int target) {
        int l = -1;
        int r = a.length;
        int mid;
        while(r > l+1) {
            mid = l + (r-l)/2;
            if(a[mid] <= target){
                l = mid;
            }else{
                r = mid;
            }
        }
        return l;
    }
}