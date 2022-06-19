package com.ankish.properties.inheritance;

public class BoxWeight extends Box {
    double weight;
    BoxWeight(){
        this.weight = -1;
    }
    public BoxWeight(BoxWeight other){
        super(other); // will not give as parent class reference variable is referring to BoxWeight object.
        this.weight = other.weight;
    }
    public BoxWeight(double l,double b,double h,double weight){
        super( l, b, h); // this calls the constructor of parent class
        this.weight = weight;
//        System.out.println(super.l); we super word to make sure that super class member l is called in case base also has member named l.
//        System.out.println(this.l);
    }
    public BoxWeight(double side,double weight){
        super(side);
        this.weight = weight;
    }
}
