package com.ankish;

public class Main {

    public static void main(String[] args) {
        // this is done in compile time
        int[] rnos; // declaration of array,rnos is getting defined in stack

        // whereas the initialization is done at runtime
        // and arrays in java are not continuous its defined by JVM
        rnos = new int[10]; // initialization: actually here object is being created in heap area;

        // new is used to create an object

        System.out.println(rnos[0]);
        String[] names = new String[5];
        // by default value of any array of object reference is NULL
        System.out.println(names[0]);
    }
}
