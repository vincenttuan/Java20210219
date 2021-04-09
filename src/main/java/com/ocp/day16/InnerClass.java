package com.ocp.day16;

public class InnerClass {
    // 一般內部類別
    class MyInner {
        void print() {
            System.out.println("MyInner");
        }
    }
    // 靜態內部類別
    static class MyStaticInner {
        static void print() {
            System.out.println("MyStaticInner");
        }
    }
}
