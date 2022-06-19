package com.ankish.interfaces.extendDemo2;
// interfaces also provide default feature also.
// static method can not be inherited that means they can not be overridden
// that means they must be implemented in interfaces
public interface A {
    static void greeting(){
        System.out.println("Hey I am static");
    }
    default void greet() {
        System.out.println("Default implementation");
    }
}
