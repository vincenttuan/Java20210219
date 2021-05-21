package com.ocp.day29;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class SchedulerDemo1 {
    public static void main(String[] args) throws Exception {
        int amount = new Random().nextInt(100000);
        System.out.printf("匯款 $%d 元\n", amount);
        
        Callable<Integer> callable = () -> amount;
        
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        ScheduledFuture<Integer> future = service.schedule(callable, 3, TimeUnit.SECONDS);
        System.out.printf("得到 $%d 元\n", future.get());
        
        service.shutdown();
    }
}
