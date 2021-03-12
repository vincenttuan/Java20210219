package com.ocp.day09;

// 工具類別
public class Util {
    // 二數相加
    public static int add(int x, int y) {
        if(x >= 50000) {
            return x + 2*y;
        }
        return x + y;
    }
}
