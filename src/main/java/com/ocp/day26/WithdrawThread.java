package com.ocp.day26;

public class WithdrawThread extends Thread {
    private Account account;
    private int amount;
    
    public WithdrawThread(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }
    
    @Override
    public void run() {
        account.withdraw(amount);
    }
    
}
