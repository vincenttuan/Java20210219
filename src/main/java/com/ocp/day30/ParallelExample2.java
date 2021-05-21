package com.ocp.day30;

import java.util.stream.IntStream;
/*
.sequential() 預設 Normal (單工)
.parallel() 平行 (多工)
*/
public class ParallelExample2 {
    public static void main(String[] args) {
        System.out.println("Normal");
        IntStream range = IntStream.rangeClosed(1, 10);
        System.out.println(range.isParallel());
        range.forEach(System.out::println);
        
        System.out.println("Parallel"); // 平行
        IntStream range2 = IntStream.rangeClosed(1, 10).parallel();
        System.out.println(range2.isParallel());
        range2.forEach(System.out::println);
        
    }
}
