package com.ankish;

public class SearchInString {
    public static void main(String[] args){
        String s = "Ankish";
        System.out.println(search( s, 's'));
        System.out.println(search( s, 'h'));
        System.out.println(search( s, 'd'));
    }
    static boolean search(String str,char target){
        for(int i = 0; i<str.length(); ++i){
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}