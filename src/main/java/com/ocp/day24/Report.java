package com.ocp.day24;

// 要給執行緒執行的工作任務
public class Report implements Runnable {

    @Override
    public void run() { // 寫報表的工作
        String tname= Thread.currentThread().getName();
        System.out.println(tname + " 寫 PPT 報表");
    }
    
}
