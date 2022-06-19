package com.ankish.singleton;

import com.ankish.access.A;

public class Main {
    public static void main(String[] args){
        // all three reference variable are referencing to one object.
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        A a = new A( 10,"Ankish");
        System.out.println(a.getNum());
    }
}