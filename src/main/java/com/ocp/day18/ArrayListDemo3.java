package com.ocp.day18;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo3 {
    // 1~5 取 3 個, 取後不放回
    public static void main(String[] args) {
        List<Integer> lotto = new ArrayList<>();
        lotto.add(1);
        lotto.add(2);
        lotto.add(3);
        lotto.add(4);
        lotto.add(5);
        System.out.println(lotto);
        
    }
}
