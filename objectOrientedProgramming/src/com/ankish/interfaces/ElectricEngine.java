package com.ankish.interfaces;

public class ElectricEngine implements Engine {
    public void acc(){
        System.out.println("ElectricEngine accelerates.");
    }
    public void start(){
        System.out.println("ElectricEngine starts");
    }
    public void stop(){
        System.out.println("ElectricEngine stops.");
    }
}
