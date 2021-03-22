package com.lab.lab1;

// 員工管理工具

import java.util.Random;
import java.util.stream.Stream;

public class EmployeeUtil {
    // 取得所有員工的薪資
    public int getAllSalary(Employee... employees) {
        // Java 8
        //return Stream.of(employees).mapToInt(e -> e.getSalary()).sum();
        return Stream.of(employees).mapToInt(Employee::getSalary).sum();
    }
    // 取得所有經理(Manager)的預算(Budget)
    public int getAllBudget(Manager... managers) {
        return Stream.of(managers).mapToInt(Manager::getBudget).sum();
    }
    // 取得所有董事(Director)的股票選擇權(StockOptions)
    public int getAllStockOptions(Director... directors) {
        return Stream.of(directors).mapToInt(Director::getStockOptions).sum();
    }
    // 公差一員
    public Employee getRandomEmployee() {
        int n = new Random().nextInt(3); // 0, 1, 2
        switch(n) {
            case 0:
                return new Employee(38000);
            case 1:
                Manager m = new Manager(68000);
                m.setBudget(10_0000);
                return m;
            default:
                Director d = new Director(88000);
                d.setBudget(50_0000);
                d.setStockOptions(100_0000);
                return d;
        }
    }
    
    
    
}
