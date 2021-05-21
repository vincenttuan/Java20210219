package com.ocp.day30;

import java.util.stream.Stream;
// 0.854 s  0.803 s
public class ParallelExample4 {
    public static void main(String[] args) {
        
        long count = Stream.iterate(0, n -> n + 1)
                .limit(100_0000)
                //.parallel()
                .filter(x -> x % 3 == 0 && x % 5 != 0)
                //.peek(x -> System.out.println(x))
                .count();
        System.out.println("count: " + count);
    }
}
