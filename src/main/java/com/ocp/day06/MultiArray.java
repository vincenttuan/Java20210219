package com.ocp.day06;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MultiArray {
    public static void main(String[] args) {
        int[][] scores = {{100, 90}, {80, 70}, {60, 50}};
        System.out.println(scores.length);
        for(int[] score : scores) {
            System.out.println(Arrays.toString(score));
        }
        // 請算出總分 = ?
        int sum = 0;
        for(int[] score : scores) {
            for(int s : score) {
                sum += s;
            }
        }
        System.out.println(sum);
        // Java 8 I
        int sum2 = 0;
        for(int[] score : scores) {
            sum2 += IntStream.of(score).sum();
        }
        System.out.println(sum2);
        // Java 8 ||
        int sum3 = Stream.of(scores).flatMapToInt(s -> IntStream.of(s)).sum();
        System.out.println(sum3);
        int sum4 = Stream.of(scores).flatMapToInt(IntStream::of).sum();
        System.out.println(sum4);
    }
}
