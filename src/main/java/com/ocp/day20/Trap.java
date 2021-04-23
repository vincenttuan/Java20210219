package com.ocp.day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Trap {
    public static void main(String[] args) {
        Stream.of(10, 20, 30).forEach(System.out::println);
        int[] x = {10, 20, 30};
        Stream.of(x).forEach(System.out::println);
        List<Integer> list = Arrays.asList(10, 20, 30);
        Stream.of(list)
                .forEach(System.out::println);
        List<Integer> list2 = Arrays.asList(40, 60);
        Stream.of(list, list2).forEach(System.out::println);
        list.stream()
                .filter(p -> p > 10)
                .forEach(System.out::println);
        Stream.of(list, list2)
                .flatMap(e -> e.stream())
                .forEach(e -> System.out.println(e));
                
    }
}
