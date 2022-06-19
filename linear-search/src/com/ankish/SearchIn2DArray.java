package com.ankish;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] a = {
                { 1, 22, 23},
                { 234, 23, 222},
                { 23, 2, 2321}
        };
        System.out.println(search( a, 22));
        System.out.println(search( a, 23));
        System.out.println(search( a, 2));
        System.out.println(search( a, -1));
    }
    static boolean search(int[][] a,int target){
        for(int i = 0; i<a.length; ++i){
            for(int j = 0; j<a[i].length; ++j){
                if(a[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}