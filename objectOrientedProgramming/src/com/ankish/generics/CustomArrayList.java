package com.ankish.generics;

import java.util.ArrayList;
import java.util.Arrays;
// creating our own implementation of arrayList.

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;
    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }
    public boolean isFull(){
        return (this.data.length == size);
    }
    public void resize(){
        int[] temp = new int[this.data.length * 2];
        // copy elements to newly created temporary array
        for(int i = 0; i<this.data.length; ++i){
            temp[i] = this.data[i];
        }
        data = temp;
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        this.data[size++] = num;
    }
    public int remove(){
        return this.data[size--];
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,int value){
        this.data[index] = value;
    }
    public String toString(){
        return "CustomArrayList{"+
                "data="+ Arrays.toString(data)+", size="+size+"}";
    }
    public static void main(String[] args){
        CustomArrayList list = new CustomArrayList();
        list.add(343);
        list.add(34);
        list.add(3433);
        list.add(3342312);
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        list.set(2,2322);
        System.out.println(list.get(2));
        System.out.println(list.toString());
        for(int i = 0; i<13; ++i){
            list.add(2 * i);
        }
        System.out.println(list.toString());
    }
}
