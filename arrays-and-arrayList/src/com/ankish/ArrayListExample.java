package com.ankish;

import java.util.ArrayList;

// When we are not aware of size of list then we use ArrayList
// Here we need not define the size of list at the time of declaration

// Actually ArrayList is implemented using array under the hood and as current array size of filled then
// arrays elements are copied to new Array which has greater size
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(343);
        list.add(23);
        list.add(3433);
        list.add(33222);
        list.add(433);
        // checking whether it contains the value or not
        if(list.contains(34)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println(list.toString());
        list.set( 0, 54); // we can update also
        System.out.println(list.toString());

        // we can remove certain index also
        list.remove(1);
        System.out.println(list.toString());
        // Can take input from user
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i = 0; i<5; ++i){
            System.out.println("Enter integer");
            int num = input.nextInt();
            list1.add(num);
        }
        // to print certain index
        System.out.println(list1.get(0));
        System.out.println(list1.get(3));
        for(int i = 0; i<list1.size(); ++i){
            System.out.println(list1.get(i));
        }
//        System.out.println(list1.toString());
    }
}