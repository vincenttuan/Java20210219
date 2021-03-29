package com.ocp.day15;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Integer[] radius = {10, -5, 15};
        Consumer<Integer> consumer1 = (t) -> System.out.println(t);
        Consumer<Integer> consumer2 = (t) -> System.out.print(t + ", ");
        Consumer<Integer> consumer3 = System.out::print;
        print(radius, consumer3);
    }
    public static void print(Integer[] radius, Consumer<Integer> consumer) {
        for(Integer r : radius) {
            consumer.accept(r);
        }
    }
}
