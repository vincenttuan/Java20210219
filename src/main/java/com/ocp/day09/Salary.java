package com.ocp.day09;

public class Salary {
    private int principalSalary; // 本薪
    private int bonus; // 獎金

    public Salary(int principalSalary, int bonus) {
        this.principalSalary = principalSalary;
        this.bonus = bonus;
    }
    
    public int getSalary() {
        int money = Util.add(principalSalary, bonus);
        return money;
    }
    
}
