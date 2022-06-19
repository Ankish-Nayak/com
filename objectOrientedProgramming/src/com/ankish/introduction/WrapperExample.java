package com.ankish.introduction;
// When a non-primitive is final then you cant reassign it but you can change the value of object.
public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        System.out.println(a+" "+b);
////        Integer num = 34;
//        // only pass by value is allowed in java.
//        swap( a, b);
//        System.out.println(a+" "+b);
//
//        Integer c = 2;
//        Integer d = 4;
//        System.out.println(c+" "+d);
//        // though c and d are passing reference using pass by value
//        // then too, its value is not changed reason is that
//        // Integer class is final therefore we cannot
//        swap( c, d);
//        System.out.println(c+" "+d);


        final A ankish = new A("Ankish Nayak");
        ankish.name = "Other name";
//        ankish = new A("dfd");

        A obj;
        /// As soon as object is dereferenced and memory is filled by Objects
        // This will lead to garbage collector to delete dereferenced Objects
        // But before deleting Object garbage collector make sure to call finallize() of
        // that Object to make sure its done with remaining thing which was suppose to be done.
        for(int i = 0; i<100000000; ++i){
            obj = new A("Random Name");
        }
    }
    static void swap(Integer a,Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
    static void swap(int a,int b){
        // here swapping will takes place within this scope only
        int temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10;
    String name;
    public A(String name){
        System.out.println("Object is created");
        this.name = name;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed.");
    }
}