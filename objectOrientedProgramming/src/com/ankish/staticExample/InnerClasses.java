package com.ankish.staticExample;

// If inner classes are non static then it can be called after its outter classes
// is instanciated.
// Otherwise we have to declare inner class static

public class InnerClasses {
    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }
        @Override
        public String toString(){
            return name;
        }
    }
    public static void main(String[] args) {
        Test a = new Test("ankish");
        Test b = new Test("rahul");
        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}