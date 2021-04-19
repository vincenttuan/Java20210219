package com.ocp.day19;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> exams = new LinkedHashMap<>();
        exams.put("國文", 100);
        exams.put("數學", 90);
        exams.put("英文", 90);
        exams.put("英文", 80);
        System.out.println(exams);
        // 取得所有 key
        Set<String> keys = exams.keySet();
        System.out.println(keys);
        // 數學的分數
        System.out.println(exams.get("數學"));
        // 所有分數的列表
        Collection<Integer> scores = exams.values();
        System.out.println(scores);
    }
}
