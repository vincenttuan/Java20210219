package com.ocp.day06;

import java.util.Arrays;

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
    }
}
