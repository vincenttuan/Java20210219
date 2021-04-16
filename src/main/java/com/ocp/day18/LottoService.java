package com.ocp.day18;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class LottoService {
    public static Set<Integer> get539() {
        Set<Integer> lotto = new LinkedHashSet<>();
        Random r = new Random();
        while(lotto.size() < 5) {
            lotto.add(r.nextInt(39)+1);
        }
        return lotto;
    }
}
