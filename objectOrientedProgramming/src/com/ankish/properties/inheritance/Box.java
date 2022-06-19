package com.ankish.properties.inheritance;

public class Box {
    double l;
    double w;
    double h;

    // default constructor.
    Box() {
//        super() // Object class will be called.
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    // cube
    Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }
    // general dimension
    Box(double l,double w,double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }
    // copy constructor
    Box(Box other){
        this.l = other.l;
        this.w = other.w;
        this.h = other.h;
    }
    public void information(){
        System.out.println("Running the box");
    }
    public void displayDimension(){
        System.out.println(this.l + " " + this.w + " " + this.h);
    }
}