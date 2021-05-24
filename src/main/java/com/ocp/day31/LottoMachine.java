package com.ocp.day31;

import java.util.Random;
import java.util.concurrent.Callable;

public class LottoMachine implements Callable<Integer>{
    private int num; // 機器編號

    public LottoMachine(int num) {
        this.num = num;
    }
    
    @Override
    public Integer call() throws Exception {
        Random r = new Random();
        Thread.sleep(r.nextInt(3000));
        return r.nextInt(10); // 0~9
    }
    
}
