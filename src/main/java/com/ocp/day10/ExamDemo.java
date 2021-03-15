package com.ocp.day10;

class Bar {
    Bar() {
        System.out.println("A");
    }
    Bar(int x) {
        this();
        System.out.println("B");
    }
}
class Foo extends Bar {
    Foo() {
        this(10);
        System.out.println("C");
    }
    Foo(int x) {
        super(20);
        System.out.println("D");
    }
}

public class ExamDemo {
    public static void main(String[] args) {
        new Foo();
    }
}
