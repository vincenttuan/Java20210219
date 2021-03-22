package com.ocp.day12;

public abstract class Car {
    private int wheel;
    public abstract void move();

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }
    
}
