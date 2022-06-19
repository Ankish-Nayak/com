package com.ankish;

public class EvensInArray {
    public static void main(String[] args) {
        int[] a = { 12, 323, 2, 2322, 22};
        System.out.println(evensInArray(a));
    }
    static int evensInArray(int[] a){
        int eCnt = 0;
        for(int i = 0; i<a.length; ++i){
            int cnt = 0;
            int num = a[i];
            while(num > 0) {
                num /= 10;
                cnt++;
            }
            if(cnt % 2 == 0){
                eCnt++;
            }
        }
        return eCnt;
    }
}