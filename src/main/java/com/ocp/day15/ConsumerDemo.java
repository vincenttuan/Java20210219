package com.ocp.day15;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Integer[] radius = {10, -5, 15};
        Consumer<Integer> consumer = (t) -> System.out.println(t);
        print(radius, consumer);
    }
    public static void print(Integer[] radius, Consumer<Integer> consumer) {
        for(Integer r : radius) {
            consumer.accept(r);
        }
    }
}
