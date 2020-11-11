package com.prastaticmethod;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";


    Student(int r, String n){
        rollno = r;
        name = n;
    }

    public Student(String name) {
        this.name = name;
    }

    void change(String college){
        this.college = college;
    }

    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
