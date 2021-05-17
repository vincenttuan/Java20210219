package com.ocp.day28;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class Car extends Thread {
    private CyclicBarrier cb;

    public Car(CyclicBarrier cb) {
        this.cb = cb;
    }

    @Override
    public void run() {
        String tname = Thread.currentThread().getName();
        System.out.printf("%s 從台北出發\n");
        try {
           Thread.sleep(new Random().nextInt(5000));
           System.out.printf("%s 到台中了\n");
           cb.await();
           //cb.await(10, TimeUnit.SECONDS);
        } catch (Exception e) {
        }
        System.out.printf("%s 繼續往高雄出發\n");
    }
    
    
}
