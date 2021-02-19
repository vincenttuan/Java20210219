package com.ocp.day01;

public class BMIDemo1 {
    public static void main(String[] args) {
        // 計算BMI
        String name = "John";
        double height = 170; // 170.0
        double weight = 60; 
        double result = weight / Math.pow(height/100, 2);
        System.out.printf("%s 的身高: %.1f 體重: %.1f bmi: %.2f\n", 
                name, height, weight, result);
        
        String name2 = "Mary";
        double height2 = 160;
        double weight2 = 48;
        double result2 = weight2 / Math.pow(height2/100, 2);
        System.out.printf("%s 的身高: %.1f 體重: %.1f bmi: %.2f\n", 
                name2, height2, weight2, result2);
    }
}
