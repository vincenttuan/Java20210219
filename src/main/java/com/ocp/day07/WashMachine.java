package com.ocp.day07;

public class WashMachine {
    // 開門
    public void open() {
        System.out.println("開門-放衣服");
    }
    // 關門
    public void close() {
        System.out.println("關門");
    }
    // 洗衣程序
    public void play() {
        System.out.println("注水");
        System.out.println("開始洗衣服");
        System.out.println("衣服洗完了");
    }
}
