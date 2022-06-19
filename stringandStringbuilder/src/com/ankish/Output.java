package com.ankish;
// anything that is to be printed is first called by .valueOf() and then
// .toString() method which in turn return string value of given object.
// each and every class should have toString() to return string representation of java
// and in Case we dont have it then default toString() method is called which is
// nothing but class name concatenated with hashCode of that object.
public class Output {
    public static void main(String[] args) {
        System.out.println(56);
        System.out.println(new int[] {34,3443, 34});
        System.out.println("Kunal");
        String name = null;
        System.out.println(name);
    }
}