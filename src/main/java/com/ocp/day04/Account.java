package com.ocp.day04;

// 銀行帳戶
public class Account {
    // 預設有100元
    private int money = 100; 
    
    // 餘額查詢的方法
    public void printMoney() {
        System.out.printf("餘額 $%d\n", money);
    }
    
    // 提款的方法
    public void withdrawal(int x) {
        System.out.printf("提款 $ %d ", x);
        if(x <= money) {
            System.out.println("成功");
            money -= x;
        } else {
            System.out.println("失敗 (餘額不足)");
        }
    }
    

}
