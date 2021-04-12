package com.ocp.day17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add("國文");
        set.add(100);
        set.add("英文");
        set.add(90);
        set.add("數學");
        set.add(80);
        set.add(null);
        System.out.println(set);
        System.out.println(set.size());
        set.remove(null);
        System.out.println(set);
        // 走訪元素
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            Object next = iter.next();
            System.out.println(next);
        }
        iter = set.iterator(); // 二次調用
        while (iter.hasNext()) {
            Object next = iter.next();
            System.out.println(next);
        }
        // 只印出科目 ?
        
    }
}
