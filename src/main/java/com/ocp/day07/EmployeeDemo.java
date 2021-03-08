package com.ocp.day07;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("John");
        e1.setLanguage("Java");
        e1.setAge(30);
        e1.setSalary(75000);
        System.out.println(e1.getName());
        System.out.println(e1.getLanguage());
        System.out.println(e1.getAge());
        System.out.println(e1.getSalary());
        System.out.println(e1);
        System.out.println(e1.toString());
        
        Employee e2 = new Employee();
        e2.setName("Mary");
        e2.setLanguage("Python");
        e2.setAge(28);
        e2.setSalary(55000);
        System.out.println(e2.getName());
        System.out.println(e2.getLanguage());
        System.out.println(e2.getAge());
        System.out.println(e2.getSalary());
        System.out.println(e2);
        System.out.println(e2.toString());
    }
}
