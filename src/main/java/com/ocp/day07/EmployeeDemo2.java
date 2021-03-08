package com.ocp.day07;

import java.util.stream.Stream;

public class EmployeeDemo2 {

    public static void main(String[] args) {
        Employee e1 = new Employee("John", "Java", 30, 75000);
        Employee e2 = new Employee("Mary", "Python", 28, 55000);
        Employee e3 = new Employee("Helen", "Java", 35, 95000);
        Employee e4 = new Employee("Anita", "Python", 32, 105000);
        Employee e5 = new Employee("Vincent", "Java", 28, 85000);
        //System.out.println(e1); // e1.toString()
        Employee[] employees = {e1, e2, e3, e4, e5};
        System.out.println(employees);
        // for-each
        for(Employee e : employees) {
            System.out.println(e);
        }
        // java 8 foreach
        Stream.of(employees).forEach(e -> System.out.println(e));
        Stream.of(employees).forEach(System.out::println);
        
    }
}
