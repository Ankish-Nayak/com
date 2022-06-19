package com.ankish.generics;

import java.util.Arrays;
import java.util.List;

// Restricting the data types which we can use to make arraylist.
// By using Wildcard

// here T should either be Number class or its subclass.
public class WildcardExample<T extends Number>{
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;
    public WildcardExample(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public void resize(){
        Object[] temp = new Object[DEFAULT_SIZE];
        for(int i = 0; i<size; ++i){
            temp[i] = this.data[i];
        }
        this.data = temp;
    }
    public boolean isFull(){
        return this.data.length == size;
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        this.data[size++] = num;
    }
    public T remove(){
        // we need to cast it.
        return (T)this.data[--size];
    }
    public void set(int index,T value){
        this.data[index] = value;
    }
    // providing number or its subclasses as parameter.
    public void getList(List<? extends Number> list){
        // do something.
    }
    public int size(){
        return this.data.length;
    }
    @Override
    public String toString(){
        return "WildcardExample = {"+Arrays.toString(this.data)+", size="+size+"}";
    }
    public static void main(String[] args){
        WildcardExample<Integer> list = new WildcardExample<>();
        list.add(89);
        list.add(343);
        list.add(3432);
        list.add(34322);
        System.out.println(list.toString());

        // not be able to create String arraylist as it does not extends Number class
//        WildcardExample<String> list1 = new WildcardExample<>();
    }
}