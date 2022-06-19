package com.ankish.abstractDemo;

public class Main {
    public static void main(String[] args){
        Son son = new Son(34);
        son.career("coder");
        son.partner("a",43);
        Daughter daughter = new Daughter(44);
        daughter.career("doctor");
        daughter.partner("nb",45);
    }
}
