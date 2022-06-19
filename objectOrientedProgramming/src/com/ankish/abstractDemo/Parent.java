package com.ankish.abstractDemo;
// when parent class any abstract method then all its child class has to Override it.
// when we know there are the methods which is for sure going to be overridden in with
// respect to child class then why should not why override them.
// you can not create the Object of abstract class.
// we can not create abstract static method as static method can not be overridden
// therefore what is the point of creating abstract static method.
// abstract constructor can also be not implemented in this.

// we can not have final abstract class as final will not allow methods to be overridden
// abstract class methods have to overridden in its child class.
// abstract class also not allow multiple inheritance.
public abstract class Parent {
    int age;
    public Parent(int age){
        this.age = age;
    }
    static void hello(){
        System.out.println("Hey");
    }
    void normal(){
        System.out.println("This is a normal method");
    }
    abstract void career(String name);
    abstract void partner(String name,int age);
}