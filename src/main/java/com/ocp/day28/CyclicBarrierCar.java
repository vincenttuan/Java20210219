package com.ocp.day28;

import java.util.concurrent.CyclicBarrier;


public class CyclicBarrierCar {
    public static void main(String[] args) {
        int n = 4;
        //CyclicBarrier cb = new CyclicBarrier(n);
        Runnable r = () -> {
            String tname = Thread.currentThread().getName();
            System.out.printf("%s 說開動,吃飯!\n", tname);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        };
        CyclicBarrier cb = new CyclicBarrier(n, r);
        new Car(cb).start();
        new Car(cb).start();
        new Car(cb).start();
        new Car(cb).start();
    }
}
