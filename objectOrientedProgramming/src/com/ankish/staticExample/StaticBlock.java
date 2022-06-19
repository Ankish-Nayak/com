package com.ankish.staticExample;

public class StaticBlock {
    static int a = 5;
    static int b;
    // static block only runs once i.e. when first object is created.
    static {
        System.out.println("I am in static block");
        b = a * 4;
    }
    public static void main(String[] args) {
        // creating first object
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        // creating second object
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }
}