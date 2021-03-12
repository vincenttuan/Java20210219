package com.ocp.day08;

public class QueryEmployees {
    public static void main(String[] args) {
        Employees e = Employees.getEmployees();
        e.print();
        Employees e2 = Employees.getEmployees();
        e2.print();
    }
}
