package com.ocp.day11;

public class Dog implements Animal{

    @Override
    public void sound() {
        System.out.println("旺旺");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }
    
}
