package com.ocp.day13;

public interface Animal {
    void move();
    default void eat() {
        System.out.println("吃罐頭食品");
    }
}
