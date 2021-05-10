package com.ocp.day27;

public class Cookies {
    private int amount;

    public Cookies(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
    
    public void put(int n) {
        System.out.printf("主人放第 %d 塊餅乾\n", n);
    }
    
    public void eat(int n) {
        System.out.printf("小狗吃第 %d 塊餅乾\n", n);
    }
    
}
