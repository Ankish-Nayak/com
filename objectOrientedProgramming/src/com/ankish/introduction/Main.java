package com.ankish.introduction;

public class Main {
    public static void main(String[] args) {
        // array of five students
        // which has rollno, name and marks;
        Student[] students = new Student[5];

//        Student ankish; // declaring reference Object of type Student
//        ankish = new Student(); // creating student object and referring it to ankish reference variable
//        System.out.println(ankish);
//        System.out.println(ankish.rno);
//        System.out.println(ankish.name);
//        System.out.println(ankish.marks);
//        ankish.rno = 34;
//        ankish.name = "ankish";
//        ankish.marks = 80;
        Student ankish = new Student( 19, "ankish", 80);
        System.out.println(ankish.rno);
        System.out.println(ankish.name);
        System.out.println(ankish.marks);
        Student random = new Student();
        System.out.println(random.rno);
        System.out.println(random.name);
        System.out.println(random.marks);
        random = new Student(ankish);
        System.out.println(random.rno);
        System.out.println(random.name);
        System.out.println(random.marks);

        Student one = new Student();
        Student two = one;
        one.name = "something something";
        System.out.println(one.name);
        System.out.println(two.name);

    }
}

class Student {
    int rno;
    String name;
    float marks;

    Student() {
        // calling another constructor from current constructor
        // internally: new Student( 13, "anuj", 69);
        this( 13,"anuj",69);
    }
    Student(int rno,String name,float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
    Student(Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
}