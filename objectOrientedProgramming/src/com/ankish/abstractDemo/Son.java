package com.ankish.abstractDemo;

public class Son extends Parent {
    int age;
    public Son(int age){
        super(age);
    }
    @Override
    void career(String name){
        System.out.println("I am going to be a "+name);
    }
    @Override
    void normal(){
        super.normal();
    }
    @Override
    void partner(String name,int age){
        System.out.println("I love "+name+" and she is "+age);
    }
}