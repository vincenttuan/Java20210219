package com.ocp.day06;

import java.util.Arrays;

public class StringArray {
    public static void updateScore(String[] s) {
        s[1] = "90";
    }
    public static void main(String[] args) {
        String[] student = {"John", "70"};
        System.out.println(Arrays.toString(student));
        updateScore(student);
        System.out.println(Arrays.toString(student));
    }
}
