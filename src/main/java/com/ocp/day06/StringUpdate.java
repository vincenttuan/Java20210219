package com.ocp.day06;

public class StringUpdate {
    public static void updateString(String x) {
        x = x.concat("8");
    }
    public static String updateString2(String x) {
        x = x.concat("8");
        return x;
    }
    public static void updateStringBuilder(StringBuilder y) {
        //y = y.append("8");
        y.append("8");
    }
    public static void main(String[] args) {
        String x = "Java";
        StringBuilder y = new StringBuilder("Java");
        updateString(x);
        updateStringBuilder(y);
        System.out.println(x);
        System.out.println(y);
        x = updateString2(x);
        System.out.println(x);
    }
}
