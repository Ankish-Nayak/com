package com.ankish;

public class Comparison {
    public static void main(String[] args) {
        // a and b are referring to same String object which is stored in
        // string pool which is part of heap area
        String a = "Ankish";
        String b = "Ankish";
        // == is used to check whether reference variable is referring to same string object
        System.out.println(a == b);
        // below two new Object is being created which are different but has same value.
        String c = new String("Ankish"); // here string object is stored in heap area but outside of string pool
        String d = new String("Ankish"); // here string object is stored in heap area but outside of string pool
        // checking whether c and d are referring to same string
        System.out.println(c == d);
        // checking whether c and d has same value to which they are reffering.
        System.out.println(c.equals(d));

        System.out.println(c.charAt(0));
        System.out.println(c.charAt(3));
    }
}