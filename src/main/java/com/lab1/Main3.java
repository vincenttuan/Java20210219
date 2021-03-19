package com.lab1;

public class Main3 {
    public static void main(String[] args) {
        Director d = new Director(88000);
        d.setBudget(30_0000);
        d.setStockOptions(100_0000);
        EmployeeUtil util = new EmployeeUtil();
        System.out.println(util.getAllSalary(d));
        System.out.println(util.getAllBudget(d));
        System.out.println(util.getAllStockOptions(d));
        
    }
}
