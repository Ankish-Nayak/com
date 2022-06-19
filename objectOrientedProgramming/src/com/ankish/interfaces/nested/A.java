package com.ankish.interfaces.nested;


public class A {
    // nested interface
    public interface NestedInterface {
        boolean isOdd(int num);
    }
}
/// we can not declare more than one class as public
// there B has to be default or private.
class B implements A.NestedInterface {
    public boolean isOdd(int num){
        return (num & 1) == 1;
    }
}
