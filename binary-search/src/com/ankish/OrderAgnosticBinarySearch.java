package com.ankish;

// here we dont know in which order the array in sorted
// ascending or descending
// therefore for each order we will create separate method for searching in array


public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6};
        int[] b = { 6, 5, 4, 3, 2, 1};
        System.out.println(orderAgonosticBS( a, 6));
        System.out.println(orderAgonosticBS( b,6));
    }
    static int orderAgonosticBS(int[] a,int target){
        if(a.length == 1){
            return (a[0] == target ? 0 : -1);
        }
        for(int i = 0; i<a.length-1; ++i) {
            if(a[i] == a[i+1]) {
                continue;
            }
            // descending order
            if(a[i] > a[i+1]) {
                return descendingOrder( a, target);
            }
            // ascending order
            else {
                return ascendingOrder( a, target);
            }
        }
        return -1;
    }
    static int descendingOrder(int[] a,int target) {
        int l = -1;
        int r = a.length;
        int mid;
        while(r > l+1) {
            mid = l + (r-l)/2;
            if(a[mid] >= target) {
                l = mid;
            }else{
                r = mid;
            }
        }
        return l;
    }
    static int ascendingOrder(int[] a,int target) {
        int l = -1;
        int r = a.length;
        int mid;
        while(r > l+1) {
            mid = l + (r-l)/2;
            if(a[mid] >= target) {
                r = mid;
            }else{
                l = mid;
            }
        }
        return r;
    }

}