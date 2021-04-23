package com.ocp.day20;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingDemo2 {
    public static void main(String[] args) {
        List<String> sex = Arrays.asList("男", "男", "男", "女", "女", "女", "男", "男");
        // 請問男女各有多少 ?
        Map<String, Long> groupingBySex = sex.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(groupingBySex);
        List<Integer> score = Arrays.asList(100, 30, 100, 80, 40, 90);
        // 請問及格與不及格各有多少 ?
        Map<String, Long> groupingByScore = score.stream()
                .collect(Collectors.groupingBy(e -> e >= 60?"及格":"不及格", Collectors.counting()));
        System.out.println(groupingByScore);
    }
}
