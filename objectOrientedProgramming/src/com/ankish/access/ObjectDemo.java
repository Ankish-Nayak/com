package com.ankish.access;

import java.util.Objects;

public class ObjectDemo {
    int num;
    float marks;
    public ObjectDemo(int num,float marks){
        this.num = num;
        this.marks = marks;
    }
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        ObjectDemo that = (ObjectDemo) o;
        return num == that.num && marks == that.marks;
    }
    // returns random integer value formed using algorithm
    // uniqueness of integer returned depends on algorithm choose.
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public String toString() {
        return "ObjectDemo{" +
                "num=" + num +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
    public static void main(String[] args){
        ObjectDemo obj = new ObjectDemo(43, 78.3f);
        ObjectDemo obj2 = new ObjectDemo(43, 78.3f);
        System.out.println(obj2.hashCode()); // will return random integer value
        System.out.println(obj.hashCode()); // will return random integer value

        // compares whether obj and obj2 are pointing to same object or not
        if(obj == obj2){
            System.out.println("Obj1 is equal to obj2");
        }
        // compares on the basis of .equals() implementation
        if(obj.equals(obj2)){
            System.out.println("obj1 is equal to obj2");
        }
        // used to check whether obj is instanceof Object or not.
        System.out.println(obj instanceof Object);
        // used to check whether obj is instanceof ObjectDemo or not.
        System.out.println(obj instanceof ObjectDemo);
        // returns the class name of which obj is instance of.
        // method which are final can not be overridden therefore getClass() can not be overridden.
        System.out.println(obj.getClass());
    }
}
