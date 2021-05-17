package com.ocp.day28;

import java.util.concurrent.TimeUnit;

class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("普通任務");
    }
}

class LongTask implements Runnable {
    @Override
    public void run() {
        System.out.println("長任務-開始");
        try {
            TimeUnit.SECONDS.sleep(5); // Thread.sleep(5000);
        } catch (Exception e) {
        }
        System.out.println("長任務-結束");
    }
}

public class ThreadPoolExecutorDemo2 {
    public static void main(String[] args) {
        
    }
}
