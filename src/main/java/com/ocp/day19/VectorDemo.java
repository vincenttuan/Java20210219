package com.ocp.day19;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector(641, 10);
        for(int i=1;i<=641;i++) {
            v.add(i);
        }
        v.add(100);
        System.out.println("size: " + v.size());
        System.out.println("capacity: " + v.capacity());
    }
}
