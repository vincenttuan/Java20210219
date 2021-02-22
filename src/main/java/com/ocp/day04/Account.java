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
        System.out.printf("提款 $%d ", x);
        // 驗證提款要件
        // 1.驗證提款金額是否<=0
        if(x <= 0) {
            System.out.println("提款金額錯誤");
            return; // 中斷方法
        }
        // 2.驗證x是否大於目前餘額?
        if(x > money) {
            System.out.println("提款金額不足");
            return;
        }
        // 3.驗證x是否大於10萬?
        if(x > 10_0000) {
            System.out.println("提款金額不可超過10萬");
            return;
        }
        
        // 進行提款程序
        System.out.println("成功");
        money -= x;
    }
    

}
