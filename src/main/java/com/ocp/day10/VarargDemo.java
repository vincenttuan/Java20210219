package com.ocp.day10;

import java.util.stream.IntStream;

public class VarargDemo {
    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
        int[] values = {10, 20, 30, 40, 50};
        System.out.println(add(values));
    }
    public static int add(int x, int y) {
        return x + y;
    }
    public static int add(int x, int y, int z) {
        return x + y + z;
    }
    public static int add(int[] values) {
        return IntStream.of(values).sum();
    }
}
