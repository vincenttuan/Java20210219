package com.ocp.day05;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        // 全班有6個人此次考數學的成績列表
        int[] scores1 = {80, 90, 90, 100, 40, 50};
        System.out.printf("數學: %s\n", Arrays.toString(scores1));
        // 想要知道總分 = ?
        //int sum = scores1[0]+scores1[1]+scores1[2]+scores1[3]+scores1[4]+scores1[5];
        // Java 7
        int sum = 0;
        for(int i=0, lens=scores1.length;i<lens;i++) {
            sum += scores1[i];
        }
        System.out.printf("總分: %d\n", sum);
    }
}
