package com.ankish;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        // intialisation
        for(int i = 0; i<3; ++i){
            list.add(new ArrayList<>());
        }
        // add elements

        for(int i = 0; i<3; ++i){
            for(int j = 0; j<3; ++j){
                System.out.println("Enter element :");
                int num = input.nextInt();
                list.get(i).add(num);
            }
        }

        // printing elements

        for(int i = 0; i<3; ++i){
            for(int j = 0; j<3; ++j){
                System.out.print(list.get(i).get(j));
            }
            System.out.println();
        }
    }

}