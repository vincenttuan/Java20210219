package com.ocp.day19;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> exams = new LinkedHashMap<>();
        exams.put("國文", 100);
        exams.put("數學", 80);
        exams.put("英文", 90);
        // 求總分
        exams.entrySet().stream().forEach(System.out::println);
        int sum = exams.entrySet().stream().mapToInt(entry -> entry.getValue()).sum();
        System.out.println(sum);
    }
}
