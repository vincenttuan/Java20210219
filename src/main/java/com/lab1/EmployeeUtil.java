package com.lab1;

// 員工管理工具

import java.util.stream.Stream;

public class EmployeeUtil {
    // 取得所有員工的薪資
    public int getAllSalary(Employee... employees) {
        // Java 7
//        int sum = 0;
//        for(Employee e : employees) {
//            sum += e.getSalary();
//        }
//        return sum;
        // Java 8
        //return Stream.of(employees).mapToInt(e -> e.getSalary()).sum();
        return Stream.of(employees).mapToInt(Employee::getSalary).sum();
    }
}
