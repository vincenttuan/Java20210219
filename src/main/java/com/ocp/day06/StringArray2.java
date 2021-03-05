package com.ocp.day06;

import java.util.Arrays;

public class StringArray2 {
    public static String[] updateStudent() {
        String[] s = {"Mary", "90"};
        return s;
    }
    public static void main(String[] args) {
        String[] student = {"John", "70"};
        System.out.println(Arrays.toString(student));
        // 進行學生交換
        student = updateStudent();
        System.out.println(Arrays.toString(student));
    }
}
