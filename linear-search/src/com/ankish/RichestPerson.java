package com.ankish;

public class RichestPerson {
    public static void main(String[] args) {
        int[][] a = {
                { 1, 2, 3},
                { 3, 2, 22}
        };
        System.out.println(richestPerson(a));
    }
    static int richestPerson(int[][] a){
        int maxWealth = 0;
        for(int i = 0; i<a.length; ++i){
            int currWealth = 0;
            for(int j = 0; j<a[i].length; ++j){
                currWealth += a[i][j];
            }
            if(maxWealth < currWealth) {
                maxWealth = currWealth;
            }
        }
        return maxWealth;
    }
}