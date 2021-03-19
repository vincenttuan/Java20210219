package com.lab1;

// 員工管理工具

import java.util.stream.Stream;

public class EmployeeUtil {
    // 取得所有員工的薪資
    public int getAllSalary(Employee... employees) {
        // Java 8
        //return Stream.of(employees).mapToInt(e -> e.getSalary()).sum();
        return Stream.of(employees).mapToInt(Employee::getSalary).sum();
    }
    // 取得所有經理(Manager)的薪資
    public int getAllSalary(Manager... managers) {
        return Stream.of(managers).mapToInt(Manager::getSalary).sum();
    }
    // 取得所有董事(Director)的薪資
    public int getAllSalary(Director... directors) {
        return Stream.of(directors).mapToInt(Director::getSalary).sum();
    }
    
}
