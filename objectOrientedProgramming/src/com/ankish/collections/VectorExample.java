package com.ankish.collections;

import java.util.Vector;
import java.util.List;
// vectors are synchronized therefore only one thread can access at time.
public class VectorExample {
    public static void main(String[] args) {
        List<Integer> vector = new Vector<>();
        vector.add(34);
        vector.add(32);
        vector.add(23);
        vector.add(23);
        System.out.println(vector);
    }
}