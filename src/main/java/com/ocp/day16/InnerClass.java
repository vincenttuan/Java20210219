package com.ocp.day16;

public class InnerClass {
    int x = 100;
    static int sx = 200;
    // 一般內部類別
    class MyInner {
        void print() {
            System.out.println("MyInner");
            System.out.println(InnerClass.this.x);
            System.out.println(InnerClass.sx);
            MyStaticInner.print();
        }
    }
    // 靜態內部類別
    static class MyStaticInner {
        static void print() {
            System.out.println("MyStaticInner");
            System.out.println(InnerClass.sx);
        }
    }
}
