package com.ocp.day06;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Java";
        StringBuilder s2 = new StringBuilder("Java");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2.toString());
        System.out.println(s1 == s2.toString().intern());
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s2.toString()));
    }
}
