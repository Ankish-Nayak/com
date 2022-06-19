package com.ankish.generics;

import java.util.ArrayList;

public class lambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<5; ++i){
            arr.add(i+1);
        }
        arr.forEach((item) -> System.out.println(item*2));

        // impelementing interface using interfaces

        Operation sum = (a,b) -> a+b;
        Operation sub = (a,b) -> a-b;
        Operation div = (a,b) -> a/b;
        Operation mul = (a,b) -> a*b;
        lambdaFunctions myCalculator = new lambdaFunctions();
        System.out.println(myCalculator.operate( 3, 4, sum));
        System.out.println(myCalculator.operate( 4, 3, div));
        System.out.println(myCalculator.operate( 5, 3, mul));
    }
    private int operate(int a,int b,Operation op){
        return op.operation(a,b);
    }
}

interface Operation {
    int operation(int a,int b);
}