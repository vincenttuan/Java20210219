package com.ocp.day15;

import java.util.stream.Stream;
import java.util.function.Supplier;

public class LambdaDemo {
    public static void main(String[] args) {
        Integer[] radius = {5, -10, 15};
        Supplier<Double> pi = () -> Math.PI; // Supplier
        Stream.of(radius)
                .filter(t -> t > 0) // Predicate
                .mapToDouble(t -> Math.pow(t, 2) * pi.get()) // Function
                .forEach(System.out::println); // Consumer
    }
}
