package com.ankish.properties.inheritance;

public class Main {
    public static void main(String[] args){
//        Box box = new Box();
//        box.displayDimension();
//        Box box1 = new Box(3);
//        box1.displayDimension();
//        Box box2 = new Box( 2, 3, 4);
//        box2.displayDimension();
//        Box box3 = new Box(box2);
//        box3.displayDimension();
//
//        Box box5 = new BoxWeight(2,3,4,6);
//        // we will have the access to only those members which are part of Box classes
////        System.out.println(box5.weight); // Box5 is reference variable of Box and it does not have access to BoxWeight class members
//        System.out.println(box5.l);
//        BoxWeight box6 = new BoxWeight( 2, 3, 43, 6);
//        System.out.println(box6.l + " " + box6.w + " " + box6.h + " " + box6.weight);;

        //there are many variables in both parent and child class
        // you are given access to those variables which are part of ref type i.e. BoxWeight
        // hence, you should give access to weight variable
        // this also means, that the ones you are trying to access should be initialized
        // but here, when the object itself is of parent type class, how will you call the constructor of child class
//        BoxWeight box6 = new Box( 4, 43, 2);
//        System.out.println(box6);

        BoxPrice box = new BoxPrice();
        BoxPrice box2 = new BoxPrice( 4.4, 4, 4);
    }
}