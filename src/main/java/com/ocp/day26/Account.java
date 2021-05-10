package com.ocp.day26;

// 帳戶資源
public class Account {
    // 帳戶餘額
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }
    
    // 查詢帳戶餘額
    public int getBalance() {
        return balance;
    }
    
    // 提款方法, amount 表示提款的金額
    public void withdraw(int amount) {
        String tname = Thread.currentThread().getName();
        System.out.printf("%s 準備提款 $%d\n", tname, amount);
        // 檢查帳戶餘額
        
        
    }
    
    
    
}
