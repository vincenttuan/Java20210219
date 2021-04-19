package com.ocp.day19;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector();
        for(int i=1;i<=10;i++) {
            v.add(i);
        }
        System.out.println("size: " + v.size());
        System.out.println("capacity: " + v.capacity());
    }
}
