package com.ankish.generics.comparing;

public class Student implements Comparable<Student>{
    int rollNo;
    float marks;
    Student(int rollNo,float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }
    public int compareTo(Student that){
        return (int)(this.marks-that.marks);
    }
    public String toString(){
        return "Student:{ rollNo: "+rollNo+", marks: "+marks+"}";
    }
}

//package com.ankish.generics.comparing;
//
//public class Student implements Comparable<Student> {
//    int rollNo;
//    float marks;
//    Student(int rollNo,float marks){
//        this.rollNo = rollNo;
//        this.marks = marks;
//    }
//    public String toString(){
//        return "{ rno="+this.rollNo+", marks="+this.marks+"}";
//    }
//
//    public int compareTo(Student that){
//        int diff = (int)(this.marks - that.marks);
//        // diff = 0 means both are equal
//        // if diff < 1: means that is bigger
//        // if diff > 1: means this is bigger
//        return diff;
//    }
//}