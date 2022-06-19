package com.ankish;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        // here each and every time new string object is created
        // and series reference to that string object
        // this leads to wastage of speed and space
        // o(n*n) is the performance of this
        for(int i = 0; i<26; ++i){
            char ch = (char)('a'+i);
            series = series + ch;
        }
        System.out.println(series);
        // in Order to overcome above problem we have StringBuilder class,
    }
}