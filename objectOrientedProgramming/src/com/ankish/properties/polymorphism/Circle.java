package com.ankish.properties.polymorphism;

public class Circle extends  Shapes {
    // area() is overridden here.
    @Override // anotation which tells that area() is overridden
    void area(){
        System.out.println("area is 3.14*r*r");
    }
}
