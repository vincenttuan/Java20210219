package com.lab.lab1;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(38000);
        Employee e2 = new Employee(48000);
        Employee e3 = new Employee(58000);
        Employee e4 = new Manager(68000);
        Employee e5 = new Manager(78000);
        Employee e6 = new Director(88000);
        EmployeeUtil util = new EmployeeUtil();
        int sum = util.getAllSalary(e1, e2, e3, e4, e5, e6);
        System.out.println(sum);
        
    }
}
