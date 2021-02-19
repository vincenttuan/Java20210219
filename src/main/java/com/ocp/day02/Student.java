package com.ocp.day02;
// Data class
// 物件 = 實體, 實例, instance
public class Student {
    // 屬性/變數/資產/欄位
    // static : 類別的, 靜態的
    public static String schoolName; // 學校
    public String name; // 姓名
    public int age; // 年齡
    // 方法
    // 印出學生資料
    public void print() {
        System.out.printf("%s %s %d\n", 
                schoolName, name, age);
    }
}
