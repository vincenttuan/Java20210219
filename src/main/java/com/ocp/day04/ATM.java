package com.ocp.day04;

public class ATM {
    public static void main(String[] args) {
        Account act = new Account();
        act.printMoney();
        act.withdrawal(70);
        act.printMoney();
        act.withdrawal(50);
        act.printMoney();
    }
}
