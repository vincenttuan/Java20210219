package com.ocp.day30;

import java.util.stream.IntStream;
import java.util.stream.Stream;

// 老師的硬體設備: CPU: i7 2.8G RAM: 16G, OS: mac 10.15.5
public class ParallelExample5 {
    public static void main(String[] args) {
        long count = Stream.iterate(0, n -> n + 1)
                .limit(500_0000)
                .parallel()
                .filter(ParallelExample5::isPrime)
                .count();
        System.out.println("count: " + count);
    }
    
    public static boolean isPrime(int x) {
        if(x <= 1) return false;
        return !IntStream.rangeClosed(2, (int)Math.sqrt((double)x)).anyMatch(i -> x % i == 0);
    }
}
