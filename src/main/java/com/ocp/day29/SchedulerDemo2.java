package com.ocp.day29;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class SchedulerDemo2 {
    public static void main(String[] args) {
        Runnable r = () -> {
            int n = new Random().nextInt(9) + 1;
            System.out.printf("開獎號碼：%d\n", n);
        };
        
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        int initDelay = 0;
        int delay = 3;
        service.scheduleWithFixedDelay(r, initDelay, delay, TimeUnit.SECONDS);
    }
}
