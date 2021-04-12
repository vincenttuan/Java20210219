package com.ocp.day17;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo4 {
    public static void main(String[] args) {
        // 集合轉Array
        Set<String> phones = new LinkedHashSet<>();
        phones.add("Pixel");
        phones.add("Apple");
        phones.add("MI");
        // 先準備一個空的字串陣列
        String[] s1 = new String[phones.size()];
        System.out.println(Arrays.toString(s1));
        phones.toArray(s1); // 將 phones 資料複製給 s1
        System.out.println(Arrays.toString(s1));
        // Java 8
        String[] s2 = phones.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(s2));
    }
}
