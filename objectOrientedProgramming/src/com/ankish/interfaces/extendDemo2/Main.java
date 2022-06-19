package com.ankish.interfaces.extendDemo2;

// overridden methods can not be less restrictive than they were
// that means you can not narrow the scope of availability of method.
public class Main implements A, B{
    public void fun(){

    }
    public void greet(){

    }
    public static void main(String[] args){
        Main obj = new Main();
        A.greeting();
    }
}
