package com.ankish.interfaces;

// Parent class does not know the methods about child class
// but child classes know about the methods of parent class.
// so when we are calling one function from child class that function exist
// at the parent class then both parent class and child class has to exist at compile time.
// so that the java compiler can check whether every thing is compaitble or not.
// so more functions to be available to child classes more function is pushed
// higher and higher in the parent classes
// and this problem is solved by interfaces as it disconnect the definition of a method
// from the hierarchy of classes.

// Interfaces have overhead while invocation of methods
// so we should avoid using interfaces in performance critical code.
public class Main {
    public static void main(String[] args){
//        Car car = new Car();
//        car.acc();
//        car.brake();
//        car.start();
//        car.stop();
//
//        Media carMedia = new Car();
//        carMedia.stop();

        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}