package com.ankish.singleton;
// class of which you can create one object only.

public class Singleton {
    private Singleton(){

    }
    // we will keep the instance of one object of Singleton class
    private static Singleton instance;
    // this will return instance of Singleton class
    public static Singleton getInstance() {
        // only of object of singleton is created.
        if(instance == null){
            // creating instance of singleton class.
            instance = new Singleton();
        }
        return instance;
    }
}