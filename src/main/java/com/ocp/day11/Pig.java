package com.ocp.day11;

public class Pig implements Animal {

    @Override
    public void sound() {
        System.out.println("Wee Wee");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }
    
}
