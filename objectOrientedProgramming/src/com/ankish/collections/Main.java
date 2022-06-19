package com.ankish.collections;

import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// list is unsynchronized that means multiple threads can access.
// whereas vectors are synchronized that means one thread can access at a time.
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new LinkedList<>();
        list1.add(334);
        list1.add(23);
        list1.add(234);
        System.out.println(list1);
    }
}
