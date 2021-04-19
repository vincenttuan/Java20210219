package com.ocp.day19;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<5;i++) {
            stack.push(i);
        }
        System.out.println(stack);
        while(!stack.isEmpty()) {
            int value = stack.pop();
            System.out.println(value + ", " + stack);
        }
    }
}
