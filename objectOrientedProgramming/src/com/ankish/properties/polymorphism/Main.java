package com.ankish.properties.polymorphism;

// what it is able to access defined by the reference and which one it will able to access is defined by Object of which its created
// to know which method to call is defined by Dynamic method dispatch and that is resolved at run time.
// therefore it uis
public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        circle.area();
        square.area();
        shape.area();
        // which class area() is method is called depends on what type of object is created.
        Shapes square1 = new Square();
        square1.area();
    }
}
