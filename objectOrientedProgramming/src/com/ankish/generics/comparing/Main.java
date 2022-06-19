package com.ankish.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        Student ankish = new Student(1,98.3f);
        Student arun = new Student(2,78.3f);
        Student arpit = new Student(3,56.33f);
        Student avinash = new Student(4,78.34f);
        Student[] students = {ankish,arun,arpit,avinash};
        System.out.println(Arrays.toString(students));

        // sorting students array in accordance to rollNo
        Arrays.sort(students,new Comparator<Student>(){
            public int compare(Student s1,Student s2 ) {
                return (int) (s1.rollNo-s2.rollNo);
            }
        });

        System.out.println(Arrays.toString(students));

        // sorting in accordance to marks of students
        Arrays.sort(students,new Comparator<Student>(){
            public int compare(Student s1,Student s2){
                return (int) (s1.marks-s2.marks);
            }
        });

        System.out.println(Arrays.toString(students));
    }
}