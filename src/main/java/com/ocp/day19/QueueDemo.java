package com.ocp.day19;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // 排隊打針
        Queue<String> names = new LinkedList<>();
        names.offer("John");
        names.offer("Mary");
        names.offer("Helen");
        System.out.println("排隊打針: " + names);
        while (!names.isEmpty()) {            
            String name = names.poll();
            System.out.println(name + "在打針, 排隊打針: " + names);
        }
    }
}
