package com.ocp.day25;

class Father extends Thread {
    public void run() {
        System.out.println("爸爸下班回家");
        System.out.println("爸爸準備洗澡");
        System.out.println("爸爸發現沒熱水");
        System.out.println("爸爸請瓦斯工人送瓦斯");
        Worker worker = new Worker();
        worker.start();
        
        try {
            worker.join();
        } catch (Exception e) {
        }
        
        System.out.println("爸爸開始洗澡");
        System.out.println("爸爸洗完澡了");
    }
}

class Worker extends Thread {
    public void run() {
        System.out.println("瓦斯工人準備送瓦斯");
        for(int i=1;i<=10;i++) {
            try {
                System.out.print(i + "秒鐘 ");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("工人發生意外:" + e);
            }
        }
        System.out.println("\n瓦斯工人將瓦斯送達");
    }
}

public class Shower {
    public static void main(String[] args) {
        Father father = new Father();
        father.start();
    }
}
