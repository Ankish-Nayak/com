package com.ankish.interfaces;

public class PowerEngine implements Engine {
    public void acc(){
        System.out.println("Power engine accelerate");
    }
    public void start(){
        System.out.println("Power engine starts.");
    }
    public void stop(){
        System.out.println("Power engine stop");
    }
}
