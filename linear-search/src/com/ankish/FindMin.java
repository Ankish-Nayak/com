package com.ankish;

public class FindMin {
    public static void main(String[] args){
        int[] a = { 2, 23, 12, 2, 34, 53, -3, 34, -434, 3};
        System.out.println(min(a));
    }
    static int min(int[] a){
        int Min = a[0];
        for(int i = 0; i<a.length; ++i){
            if(Min > a[i]){
                Min = a[i];
            }
        }
        return Min;
    }
}