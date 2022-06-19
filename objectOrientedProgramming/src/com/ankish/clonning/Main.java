package com.ankish.clonning;
// creating copy of given Object using copy constructor takes time and processing
// therefore to overcome this overhead java predefined method that is Clonneable interface


// shallow copy : creating copy of object where non-premititives new copy is not created
// but references are pointed.
// deep copy : creating copy of object where all members are copied.
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human ankish = new Human( 34, "ankish");
        // creating copy of object using copy constructor.
//        Human rahul = new Human(ankish);
        Human rahul;
//        System.out.println(ankish.toString());
//        System.out.println(rahul.toString());
        // creating copy of object using clone method.
        rahul = (Human)ankish.clone();
        System.out.println(ankish.toString());
        System.out.println(rahul.toString());
        rahul.arr[0] = 2332;
        System.out.println(ankish.toString());
        System.out.println(rahul.toString());
    }
}
