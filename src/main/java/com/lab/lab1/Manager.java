package com.lab.lab1;


public class Manager extends Employee {

    private int budget;

    public Manager() {
    }

    public Manager(int salary) {
        setSalary(salary);
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        if(budget > 0) {
            this.budget = budget;
        }
    }

}
