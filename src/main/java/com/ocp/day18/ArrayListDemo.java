package com.ocp.day18;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListDemo {
    public static void main(String[] args) {
        // 四星彩(0~9)取四個可重複的數字
        List<Integer> lotto = new ArrayList<>();
        Random r = new Random();
        for(int i=0;i<4;i++) {
            int n = r.nextInt(10);
            lotto.add(n);
        }
        System.out.println(lotto);
    }
}
