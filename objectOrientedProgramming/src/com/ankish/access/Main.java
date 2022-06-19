package com.ankish.access;

public class Main {
    public static void main(String[] args) {
        A obj = new A( 10, "Ankish");
//        System.out.println(obj.num); private members can not be accessed out the class
        System.out.println(obj.getNum());
    }
}