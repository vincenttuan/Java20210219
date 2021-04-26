package com.ocp.day21;

public class AppleShare2 {
    public static void main(String[] args) {
        int n = 0; // n 人數
        try {
            submit(n);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace(System.out); // 印出程式碼詳細錯誤資訊
        }
    }
    
    public static void submit(int n) throws Exception { // n 人數
        if(n <= 0) {
            Exception e = new Exception("n <= 0");
            throw e;
        }
        int apple = 10;
        int result = 0;
        result = apple / n;
        System.out.println(result);
    }
}
