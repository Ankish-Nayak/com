package com.ankish.properties.polymorphism;
// same functions with different number of argument or order of argument.
// this is method overloading
// memory allocation happens at runtime but checking and which method to run happens at compile time.

// at compile time we will know which function to run
// therefore it is called compile time polymorphism or static polymorphism
public class Numbers {
    double sum(double a,int b){
        return a + b;
    }
    int sum(int a,int b,int c){
        return a + b + c;
    }
    void sum(int a,String b){
        System.out.println(b+a);
    }
    void sum(String a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Numbers obj = new Numbers();
        System.out.println(obj.sum( 2, 4));
        System.out.println(obj.sum( 2, 3, 4));
        System.out.println(obj.sum( 3.4, 4));
        obj.sum( "d", 0);
        obj.sum( 0,"d");
    }
}
