package com.lab1;

public class Main5 {
    public static void main(String[] args) {
        // 取得公差一員
        EmployeeUtil util = new EmployeeUtil();
        Employee emp = util.getRandomEmployee();
        System.out.println(emp.getClass().getSimpleName());
        System.out.println("salary: " + emp.getSalary());
        if(emp instanceof Manager) {
            Manager m = (Manager)emp; // 將 emp 轉成 Manager
            System.out.println("budget: " + m.getBudget());
        }
        if(emp instanceof Director) {
            Director d = (Director)emp; // 將 emp 轉成 Director
            System.out.println("stock options: " + d.getStockOptions());
        }
    }
}
