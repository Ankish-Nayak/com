package com.ankish;

import java.util.ArrayList;

// plus operator can be applied in Java for primitives and when any one argument is string

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'a');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));
        System.out.println("a"+1);
        // this is same as "a" + "1"
        // integer will be converted to Integer wrapper class that will call toString()

        System.out.println("ankish"+new ArrayList<>());
        System.out.println("ankish"+new Integer(43));
    }
}