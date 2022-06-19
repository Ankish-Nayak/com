package com.ankish.generics;

// https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html#createObjects
// Generics helps us to implement more general form of class
// for example we can create arraylist for different classes such Integer,String,Float
// using just One class implementation using Generics.
import java.util.Arrays;

public class CustomGenericArrayList<T> {
    private Object[] data; // reference for storing array of data type T
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        this.data[size++] = num;
    }
    private void resize(){
        Object[] temp = new Object[this.data.length * 2];
        for(int i = 0; i<size; ++i) {
            temp[i] = this.data[i];
        }
        data = temp;
    }
    private boolean isFull(){
        return (this.data.length == size);
    }
    public T remove(){
        // here casting is necessary cuz ur are converting bigger type to smaller type
        return (T) (this.data[--size]);
    }
    public T get(int index){
        return (T) (this.data[index]);
    }
    public int size(){
        return size;
    }
    public void set(int index,T data){
        // in bigger one you are adding smaller one therefore no casting is required.
        this.data[index] = data;
    }
    public String toString(){
        return "CustomGenericArrayList : { "+Arrays.toString(this.data)+", size="+
                size+"}";
    }
    public static void main(String[] args){
        CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
        list.add(3);
        list.add(343);
        list.add(323);
        list.add(34343);
        System.out.println(list.toString());
        CustomGenericArrayList<String> list1 = new CustomGenericArrayList<>();
        list1.add("ankish");
        list1.add("anuj");
        list1.add("ananmica");
        System.out.println(list1.toString());
        list1.set(2,"arun");
        list1.remove();
        System.out.println(list1.toString());
        CustomGenericArrayList<Integer> list2 = new CustomGenericArrayList<>();

        for(int i = 0; i<14; ++i){
            list2.add(i*2);
        }
        System.out.println(list2.toString());
    }
}