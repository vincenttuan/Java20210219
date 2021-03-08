package com.ocp.day07;

public class WrapperClassDemo {
    public static void main(String[] args) {
        int a = 100;
        Integer b = new Integer(200); // Java 5 之前
        System.out.println(a + b.intValue()); // Java 5 之前
        System.out.println(a + b); // Java 5 之後 (auto-unboxing)
        Integer c = 300; // Java 5 之後 取代 new Integer(300) (auto-boxing)
        System.out.printf("取得 int 得最大值: %d\n", Integer.MAX_VALUE);
        System.out.println(Integer.max(a, b));
        String chinese = "1";
        String math = "50";
        System.out.println(chinese + math);
        System.out.println(Integer.parseInt(chinese) + Integer.parseInt(math));
        System.out.println(Integer.toBinaryString(100));
    }
}
