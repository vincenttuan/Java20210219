package com.ocp.day11;

public interface Animal {
    String name = "動物"; // 屬性 public static final
    void sound(); // 抽象方法 public abstract
    void sleep(); // 抽象方法 public abstract
    
    default void info() { // 介面的 default 實作方法 (public static) for java8
        System.out.println("小小動物世界");
    }
}

