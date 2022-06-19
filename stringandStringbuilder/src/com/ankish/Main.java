package com.ankish;

// Reason why strings are not allowed to change
// As we know strings are stored in string pool when we reference that string with reference
//  variable, and Suppose there are multiple reference variable referring to a string
// and one of them try to change string than it will result in change of string for all
// reference variable who are referring to it. Therefore to avoid this problem strings are
// immutable in java.
// Storing strings in string pool is done to avoid creating multiple strings of same type
// and Therefore this optimization is used.

public class Main {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6};
        int num = 10;

        String name = "Ankish Nayak";
//        System.out.println(name);
        // In Java strings are immutable
        // and Strings which are created in java are stored in String pool
        // String pool lies in Heap area of memory
        // as soon no reference variable is referencing to string then it is collected by Grabage collector
        String a = "Ankish"; // reference variable a, referring to "Ankish" string object
        System.out.println(a);
        a = "Nayak"; // reference variable a, is now referencing to string Object "Nayak"
        System.out.println(a);
    }
}