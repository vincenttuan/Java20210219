package com.ocp.day28;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
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
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newCachedThreadPool();
        service.submit(new Task());
        service.submit(new LongTask());
        service.submit(new Task());
        service.submit(new LongTask());
        service.submit(new Task());
        System.out.println("任務配置完畢");
        
        // 平滑關閉
        service.shutdown();
        
        // 偵測是否還有工作在執行
        while (!service.awaitTermination(1, TimeUnit.SECONDS)) {            
            System.out.println("還有工作在進行...");
        }
        
        System.out.println("任務完成停止");
    }
}
