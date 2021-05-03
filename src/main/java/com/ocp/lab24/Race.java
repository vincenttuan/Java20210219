package com.ocp.lab24;

public class Race extends Thread {
    @Override
    public void run() {
        job();
    }
    private void job() {
        // 執行緒名稱
        String tname = Thread.currentThread().getName();
        for(int i=1;i<=1000;i++) {
            System.out.printf("%s 跑了 %d 步\n", tname, i);
        }
    }
}
