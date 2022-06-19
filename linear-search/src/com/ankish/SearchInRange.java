package com.ankish;

public class SearchInRange {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 232, 232, 12, 12, 23, 2};
        System.out.println(searchInRange( a, 0, 3, 3));
        System.out.println(searchInRange( a, 0, 5, 232));
        System.out.println(searchInRange( a, 0, 6, 11));
    }
    static boolean searchInRange(int[] a,int l,int r,int target){
        for(int i = l; i<=r; ++i){
            if(a[i] == target){
                return true;
            }
        }
        return false;
    }
}