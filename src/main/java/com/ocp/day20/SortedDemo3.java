package com.ocp.day20;

import java.util.Arrays;
import java.util.List;

public class SortedDemo3 {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("A", 100),
                new User("B", 40),
                new User("C", 80),
                new User("D", 30),
                new User("E", 90)
        );
        System.out.println(users);
        // 請按照分數大小來排序並置入一個新集合中
        
        
    }
}
