package com.ocp.day06;

public class StringCompare {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = "Java";
        String s4 = "Java";
        String s5 = "JaVA";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1.intern() == s3);
        System.out.println(s2.equalsIgnoreCase(s5)); // 忽略大小寫的比較
        System.out.println(s4.toUpperCase() == s5.toUpperCase()); // 全部轉大寫再比較
        System.out.println(s4.toLowerCase().equals(s5.toLowerCase())); // 全部轉小寫再比較
    }
}
