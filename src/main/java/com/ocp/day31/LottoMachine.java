package com.ocp.day31;

import java.util.Random;
import java.util.concurrent.Callable;

public class LottoMachine implements Callable<Lotto>{
    private int num; // 機器編號

    public LottoMachine(int num) {
        this.num = num;
    }
    
    @Override
    public Lotto call() throws Exception {
        Random r = new Random();
        Thread.sleep(r.nextInt(3000));
        Lotto lotto = new Lotto(num, r.nextInt(10), Thread.currentThread().getName());
        return lotto;
    }
    
}
