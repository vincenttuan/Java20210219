package com.ocp.day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedDemo1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100, 80, 90); // uneditable list
        System.out.println(list);
        // 排序(自然排序:小->大)
        Collections.sort(list);
        System.out.println(list);
        // 排序(自然排序:大->小)
        Collections.sort(list, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(list);
    }
}
