package com.ocp.day15;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Integer[] radius = {5, 10, 15};
        Consumer<Double> consumer = System.out::println;
        Function<Integer, Double> function = (t) -> Math.pow(t, 2) * Math.PI;
        print(radius, consumer, function);
        
        print(radius, (t)->System.out.printf("%.2f\n", t), function);
    }
    public static void print(Integer[] radius, 
                             Consumer<Double> consumer,
                             Function<Integer, Double> function) {
        for(Integer r : radius) {
            Double area = function.apply(r);
            consumer.accept(area);
        }
    }
}
