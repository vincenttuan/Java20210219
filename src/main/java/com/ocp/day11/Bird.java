package com.ocp.day11;

public class Bird implements Animal {

    @Override
    public void sound() {
        System.out.println("啾啾啾");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }
    
}
