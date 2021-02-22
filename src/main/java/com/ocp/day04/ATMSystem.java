package com.ocp.day04;

import java.util.Scanner;

public class ATMSystem {
    private Account account = new Account();
    
    public void menu() {
        System.out.println("-----------------");
        System.out.println("1. 提款");
        System.out.println("2. 存款");
        System.out.println("3. 查詢");
        System.out.println("0. 離開");
        System.out.println("-----------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("請選擇: ");
        int n = sc.nextInt();
        service(n);
    }
    public void service(int n) {
        Scanner sc = new Scanner(System.in);
        switch(n) {
            case 1: // 提款
                System.out.println("請輸入提款金額: ");
                int withdrawalMoney = sc.nextInt();
                account.withdrawal(withdrawalMoney);
                break;
            case 2: // 存款
                System.out.println("請輸入存款金額: ");
                int depositMoney = sc.nextInt();
                account.deposit(depositMoney);
                break;
            case 3: // 餘額
                account.printMoney();
                break;
            case 0: // 離開
                System.exit(0); // 強制離開系統
        }
    }
    
    public static void main(String[] args) {
        ATMSystem atm = new ATMSystem();
        while (true) {            
            atm.menu();
            System.out.println("按下 Enter 後繼續");
            new Scanner(System.in).nextLine();
        }
        
    }
}
