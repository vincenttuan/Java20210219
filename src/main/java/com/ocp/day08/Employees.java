package com.ocp.day08;

import java.util.stream.Stream;

public class Employees {
    private String[] employees = {"John", "Mary", "Helen"};
    
    public void print() {
        //Stream.of(employees).forEach(System.out::println);
        //Stream.of(employees).forEach(e -> System.out.println(e));
        for(String e : employees) {
            System.out.println(e);
        }
    }
}
