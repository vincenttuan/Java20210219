package com.ocp.day18;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo2 {
    // 1~5 取 3 個, 取後不放回
    public static void main(String[] args) {
        List<Integer> lotto = new ArrayList<>();
        lotto.add(1);
        lotto.add(2);
        lotto.add(3);
        lotto.add(4);
        lotto.add(5);
        System.out.println(lotto);
        ListIterator<Integer> iter = lotto.listIterator();
        while(iter.hasNext()) {
            int idx = iter.nextIndex();
            int value = iter.next();
            System.out.printf("%d: %d\n", idx, value);
        }
        //-----------------------------------------------------
        // 取出 idx = 2
        int value1 = lotto.get(2);
        // 移除 idx = 2 的元素
        lotto.remove(2);
        System.out.println(lotto);
        //-----------------------------------------------------
        // 取出 idx = 2
        int value2 = lotto.get(2);
        // 移除 idx = 2 的元素
        lotto.remove(2);
        System.out.println(lotto);
        //-----------------------------------------------------
        // 取出 idx = 1
        int value3 = lotto.get(1);
        // 移除 idx = 1 的元素
        lotto.remove(1);
        System.out.println(lotto);
        System.out.printf("取出的資料: %d %d %d\n", value1, value2, value3);
    }
}
