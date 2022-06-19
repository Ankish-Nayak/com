package com.ankish;

public class PassingExample {
    public static void main(String[] args){
        String naam = "Ankish";
        changeName(naam); // only pass by value is allowed
        System.out.println(naam);
    }
    static void changeName(String naam){
        naam = "nayak"; // creating new Object
    }
}