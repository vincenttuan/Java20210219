package com.ocp.day20;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

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
        List<User> reversedUsers = users.stream()
                .sorted((u1, u2) -> u2.getScore() - u1.getScore())
                .collect(toList());
        System.out.println(reversedUsers);
        // 請按照分數小大來排序並置入一個新集合中
        List<User> sortedUsers = users.stream()
                
                .collect(toList());
        System.out.println(sortedUsers);
    }
}
