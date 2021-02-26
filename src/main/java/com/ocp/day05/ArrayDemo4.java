package com.ocp.day05;

import java.util.Arrays;

public class ArrayDemo4 {
    public static void main(String[] args) {
        // 全班有6個人此次考數學的成績列表
        int[] scores1 = {81, 90, 90, 100, 40, 50};
        System.out.printf("數學: %s\n", Arrays.toString(scores1));
        // 找出最高分與最低分
        int max = 0;
        // Java 7
        for(int x : scores1) {
            if(x > max) {
                max = x;
            }
        }
        System.out.printf("最高分: %d\n", max);
        int min = max;
        for(int x : scores1) {
            if(x < min) {
                min = x;
            }
        }
        System.out.printf("最低分: %d\n", min);
    }
}
