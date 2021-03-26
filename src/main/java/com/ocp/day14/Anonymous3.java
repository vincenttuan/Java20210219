package com.ocp.day14;

interface Add {
    void calc(int x, int y);
}

public class Anonymous3 {
    public static void main(String[] args) {
        Add add1 = new Add() {
            @Override
            public void calc(int x, int y) {
                System.out.println(x + y);
            }
        };
        add1.calc(10, 20);
        
        Add add2 = (int x, int y) -> System.out.println(x + y);
        add2.calc(10, 20);
        
        Add add3 = (x, y) -> System.out.println(x + y);
        add3.calc(10, 20);
        
    }
}
