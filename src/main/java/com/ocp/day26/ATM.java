package com.ocp.day26;

public class ATM {
    public static void main(String[] args) {
        Account account = new Account(10000);
        // 單工模式
        account.withdraw(5000);
        account.withdraw(4000);
        account.withdraw(3000);
    }
}
