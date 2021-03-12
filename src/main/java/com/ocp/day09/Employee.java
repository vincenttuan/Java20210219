package com.ocp.day09;

public class Employee {
    private String name;
    private Salary salary;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(Salary salary) {
        this.salary = salary;
    }
    
    public Employee(String name, Salary salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }
    
    
    
}
