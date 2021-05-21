package com.ocp.day30;

import java.util.stream.IntStream;

public class ParallelExample3 {
    public static void main(String[] args) {
        System.out.println("Normal");
        IntStream range = IntStream.rangeClosed(1, 10);
        range.forEach(x -> System.out.printf("%d, %s\n", 
                           x, Thread.currentThread().getName()));
        
        System.out.println("Parallel"); // 平行
        IntStream range2 = IntStream.rangeClosed(1, 10);
        range2.parallel().forEach(x -> System.out.printf("%d, %s\n", 
                                       x, Thread.currentThread().getName()));
        
    }
}
