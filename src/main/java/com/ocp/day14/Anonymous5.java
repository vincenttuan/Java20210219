package com.ocp.day14;

@FunctionalInterface
interface BMI {
    double calc(double h, double w);
}

public class Anonymous5 {
    public static void main(String[] args) {
        // 請用 Lambda 語法實現 BMI
        // 身高 170, 體重 60
        BMI bmi = (h, w) -> w / Math.pow(h/100, 2);
        System.out.printf("%.2f\n", bmi.calc(170, 60));
    }
}
