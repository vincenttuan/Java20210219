package com.ocp.day07;

public class Employee {
    private String name;
    private String language;
    private int age;
    private int salary;
    
    // 進行屬性封裝(getter/setter)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(salary >= 25000) {
            this.salary = salary;
        }
    }
    
}