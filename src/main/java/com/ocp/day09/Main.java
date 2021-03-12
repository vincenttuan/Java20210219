package com.ocp.day09;
public class Main {
    public static void main(String[] args) {
        Employee john = new Employee();
        john.setName("John");
        Salary salary1 = new Salary(30000, 5000);
        john.setSalary(salary1);
        
        Employee mary = new Employee("Mary", new Salary(70000, 8000));
        
        System.out.printf("%s 的薪資是 $%d\n", john.getName(), john.getSalary().getMoney());
        System.out.printf("%s 的薪資是 $%d\n", mary.getName(), mary.getSalary().getMoney());
    }
}
