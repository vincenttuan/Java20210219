package com.ocp.day31;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class LottoLock implements Runnable {
    private String userNme;
    // 相當於 static synchronized
    private static final ReentrantLock LOCK = new ReentrantLock();
    public LottoLock(String userNme) {
        this.userNme = userNme;
    }
    
    @Override
    public void run() {
        try {
            LOCK.lock(); // 嘗試鎖定
            IntStream.rangeClosed(1, 5).forEach(i -> {
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                }
                int number = new Random().nextInt(10);
                System.out.printf("%s 得到第 %d 組號碼: %d, 時間 %s\n",
                        userNme, i, number, new Date().toString());
            });
        } catch (Exception e) {
            
        } finally {
            LOCK.unlock();
        }
    }
    
    // 主程式
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(new LottoLock("Vincent"));
        service.execute(new LottoLock("Anita"));
        service.shutdown();
    }
    
}
