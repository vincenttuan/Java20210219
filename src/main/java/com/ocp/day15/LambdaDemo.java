package com.ocp.day15;

import java.util.stream.Stream;

public class LambdaDemo {
    public static void main(String[] args) {
        Integer[] radius = {5, -10, 15};
        Stream.of(radius)
                .filter(t -> t > 0) // Predicate
                .mapToDouble(t -> Math.pow(t, 2) * Math.PI) // Function
                .forEach(System.out::println); // Consumer
    }
}
