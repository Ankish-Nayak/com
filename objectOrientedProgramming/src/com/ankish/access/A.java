package com.ankish.access;
// private access: will be able to access within this class.
// public access: can be accessed from any where.
// default access: can be accessed within the package only.
public class A {
    private int num;
    String name;
    int[] arr;
    public A(int num,String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
    public int getNum(){
        return this.num;
    }
    public void setNum(int num){
        this.num = num;
    }

};