package com.ankish.staticExample;

public class Main {
    public static void main(String[] args) {
        Human ankish = new Human(22, "ankish", 100000, false);
        Human rahul = new Human(22, "rahul", 90090, true);

        Human arpit = new Human(34, "arpit", 89999, true);
        System.out.println(ankish.name);
        System.out.println(rahul.name);

        System.out.println(Human.population);
        System.out.println(Human.population);
    }
    // this is independent of object
    // therefore inorder to call non-static method we have to create object of that class

    static void fun() {
//        greeting(); // we can not use this here cuz we have to create Object first

        // we cannot access non static members without referencing them
        // hence we have to create Object of class which contains that method
        Main obj = new Main();
        obj.greeting();

        Main funn = new Main();
        funn.fun2();
    }

    // we can call non-static method inside another non-static method as
    // in the end caller non-static method must be referenced somewhere in non-static
    // context
    void fun2() {
        greeting();
    }
    // something which is nonstatic requires object to be created.
    void greeting(){
        fun();
        System.out.println("Hello World");
    }
}
