package com.ocp.day05;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        // 全班有6個人此次考數學的成績列表
        int[] scores1 = {81, 90, 90, 100, 40, 50};
        System.out.printf("數學: %s\n", Arrays.toString(scores1));
        // 想要知道總分 = ?
        //int sum = scores1[0]+scores1[1]+scores1[2]+scores1[3]+scores1[4]+scores1[5];
        // Java 7 for-loop
        int sum = 0;
        for(int i=0, lens=scores1.length;i<lens;i++) {
            sum += scores1[i];
        }
        System.out.printf("總分: %d\n", sum);
        // Java 7 for-in(for-each)
        int sum2 = 0;
        for(int x:scores1) {
            sum2 += x;
        }
        System.out.printf("總分: %d\n", sum2);
        
        // 請計算平均 = ?
        double avg = (double)sum / scores1.length;
        System.out.printf("平均: %.1f\n", avg);
    }
}
