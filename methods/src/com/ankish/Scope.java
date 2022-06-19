package com.ankish;

public class Scope {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        // Scoping in block
        {
//            int a = 20; // already initialized reference variable can not be initialized again but you can change it.
            a = 20; // reassign the origin of ref variable to some other variable
            int c = 343;
            // values initialized in this block, will remain in this block
        }
        System.out.println(a);
//        System.out.println(num);
        // same rules goes for loops block scope too.
    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}