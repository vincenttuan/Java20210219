package com.ocp.day17;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {
        Set<Integer> tree = new TreeSet<>();
        tree.add(2);tree.add(7);tree.add(5);tree.add(8);
        tree.add(3);tree.add(4);tree.add(9);
        System.out.println(tree);
        // 子集
        TreeSet<Integer> tree2 = (TreeSet)tree;
        SortedSet<Integer> sub1 = tree2.subSet(5, 9); // 不含 9
        System.out.println(sub1);
        NavigableSet<Integer> sub2 = tree2.subSet(5, true, 9, true);
        System.out.println(sub2);
    }
}
