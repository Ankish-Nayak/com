package com.ankish.exceptionHandling;

// inorder to create your own custom exception class
// we need to extend it from Exception class


public class MyException extends Exception {
    public MyException(String message){
        super(message);
    }
}