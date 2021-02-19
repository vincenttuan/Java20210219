package com.ocp.day02;

public class School {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.print();
        s2.print();
        s1.schoolName = "台大";
        s1.name = "John";
        s1.age = 20;
        s2.schoolName = "台大";
        s2.name = "Mary";
        s2.age = 18;
        s1.print();
        s2.print();
    }
}
