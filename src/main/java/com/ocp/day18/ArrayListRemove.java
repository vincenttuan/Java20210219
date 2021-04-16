package com.ocp.day18;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemove {
    public static void main(String[] args) {
        List<Integer> lotto = new ArrayList<>();
        lotto.add(2); // 0
        lotto.add(1); // 1
        lotto.add(4); // 2
        lotto.add(3); // 3
        lotto.add(4); // 4
        System.out.println(lotto);
        lotto.remove(1);
        System.out.println(lotto);
        lotto.remove(Integer.valueOf(4));
        System.out.println(lotto);
        
    }
}
