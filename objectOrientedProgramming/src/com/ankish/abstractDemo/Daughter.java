package com.ankish.abstractDemo;

public class Daughter extends Parent {
    int age;
    public Daughter(int age) {
        super(age);
    }
    @Override
    void normal(){
        super.normal();
    }
    @Override
    void career(String name){
        System.out.println("I am going to be a "+name);
    }
    @Override
    void partner(String name,int age) {
        System.out.println("He is "+name+" and his age is "+age+".");
    }
}