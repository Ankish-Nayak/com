package com.ankish;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = { -18, -12, -4, 0, 1, 2, 3, 4, 5, 6};
        int target = 22;
        System.out.println(binarySearch( a, 3));
        System.out.println(binarySearch( a, 5));
        System.out.println(binarySearch( a, 8));
    }
    static int binarySearch(int[] a,int target){
        int l = -1;
        int r = a.length;
        int mid;
        while(r > l+1) {
            mid = l + (r-l)/2;
            if(a[mid] >= target){
                r = mid;
            }else{
                l = mid;
            }
        }
        return r;
    }
}