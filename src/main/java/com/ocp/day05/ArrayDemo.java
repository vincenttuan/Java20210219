package com.ocp.day05;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        // 全班有6個人此次考數學的成績列表
        int[] scores1 = {80, 90, 90, 100, 40, 50};
        // 全班有6個人此次考國文的成績列表
        int[] scores2 = new int[6];
        scores2[0] = 100;
        scores2[1] = 20;
        scores2[2] = 90;
        scores2[3] = 70;
        scores2[4] = 30;
        scores2[5] = 100;
        // 列印成績
        System.out.println(scores1);
        System.out.println(scores2);
        System.out.printf("數學: %s\n", Arrays.toString(scores1));
        System.out.printf("國文: %s\n", Arrays.toString(scores2));
    }
}
