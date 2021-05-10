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
    public synchronized void withdraw(int amount) {
        String tname = Thread.currentThread().getName();
        System.out.printf("%s 準備提款 $%d\n", tname, amount);
        // 檢查帳戶餘額
        // 1.先取得目前的帳戶餘額
        int currentBalance = getBalance();
        // 2.目前帳戶餘額是否足夠提款
        if(currentBalance >= amount) {
            // 開始提款
            // 利用 for-loop 模擬提款所花的時間
            for(int i=0 ; i<Integer.MAX_VALUE ; i++);
            // 變更帳戶餘額
            // 帳戶餘額 = 目前帳戶餘額 - 提款金額
            balance = currentBalance - amount;
            // 印出交易成功清單
            System.out.printf("%s 提款 $%d 成功, 帳戶餘額 $%d\n", tname, amount, getBalance());
        } else {
            // 印出交易失敗清單
            System.out.printf("%s 提款 $%d 失敗(餘額不足), 帳戶餘額 $%d\n", tname, amount, getBalance());
        }
        
    }
    
    
    
}
