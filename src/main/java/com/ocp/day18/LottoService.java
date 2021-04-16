package com.ocp.day18;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoService {
    static Random r = new Random();
    public static Set<Integer> get539() {
        Set<Integer> lotto = new LinkedHashSet<>();
        while(lotto.size() < 5) {
            lotto.add(r.nextInt(39)+1); // 1~39
        }
        return lotto;
    }
    public static List<Integer> get4Stars() {
        List<Integer> lotto = new ArrayList<>();
        for(int i=0;i<4;i++) {
            lotto.add(r.nextInt(10)); // 0~9
        }
        return lotto;
    }
}
