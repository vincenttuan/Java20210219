package com.ocp.day14;

public class MethodInnerClass {
    void foo() {
        int x = 1;
        int y = 2;
        class Hello {
            void print() {
                System.out.println(y);
            }
        }
    }
}
