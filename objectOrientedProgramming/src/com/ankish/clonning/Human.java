package com.ankish.clonning;
import java.util.Arrays;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr = new int[]{ 3, 43, 23, 3, 34, 3};
    public Human(int age,String name){
        this.age = age;
        this.name = name;
    }
//    public Human(Human other){
//        this.name = other.name;
//        this.age = other.age;
//    }
    public Object clone() throws CloneNotSupportedException {
        Human twin = (Human)super.clone(); // shallow copy
        // making deep copy
        // we have to just create new copy of all non-premitives object.
        twin.arr = new int[this.arr.length];
        for(int i = 0; i<this.arr.length; ++i){
            twin.arr[i] = this.arr[i];
        }
        return twin;

    }
    public String toString(){
        return "Human : { age="+age+", name="+name+", arr:"+Arrays.toString(arr)+"}";
    }
}