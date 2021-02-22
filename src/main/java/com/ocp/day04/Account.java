package com.ocp.day04;

// 銀行帳戶
public class Account {
    // 預設有100元
    private int money = 100; 
    
    // 餘額查詢的方法
    public void printMoney() {
        System.out.printf("$%d\n", money);
    }

}
