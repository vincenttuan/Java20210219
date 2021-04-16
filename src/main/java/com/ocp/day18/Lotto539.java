package com.ocp.day18;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Lotto539 {
    // 樂透 539 電腦選號 (1~39取出5個不重複的數字)
    public static void main(String[] args) {
        Random r = new Random();
        Set<Integer> lotto = new LinkedHashSet<>();
        while (lotto.size() < 5) {            
            int n = r.nextInt(39) + 1;
            lotto.add(n);
        }
        System.out.println(lotto);
    }
}
