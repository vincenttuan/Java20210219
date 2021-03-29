package com.ocp.day15;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        BinaryOperator<Integer> salary = (principleSalary, bonus) -> principleSalary + bonus;
        System.out.println(salary.apply(50000, 15000));
        
        Integer[] length = {10, 20, 30}; // 正方形的邊長
        UnaryOperator<Integer> area = (t) -> t * t;
        Function<Integer, Integer> area2 = (t) -> t * t;
        Stream.of(length)
                .map(area2)
                .forEach(System.out::println);
    }
    
}
