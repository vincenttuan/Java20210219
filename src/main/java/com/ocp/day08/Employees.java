package com.ocp.day08;

import java.util.stream.Stream;

public class Employees {
    private String[] employees = {"John", "Mary", "Helen"};
    
    // 自行建立一個 static Employees 的物件
    private static Employees _instance = new Employees();
    // 設定 private 建構子
    private Employees(){
    
    }
    // 提供一個 public static 方法讓外界得到你建立的唯一物件
    public static Employees getEmployees() {
        return _instance;
    }
    
    public void print() {
        //Stream.of(employees).forEach(System.out::println);
        //Stream.of(employees).forEach(e -> System.out.println(e));
        for(String e : employees) {
            System.out.println(e);
        }
    }
}
