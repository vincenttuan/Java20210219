package com.ocp.day06;

public class StringUpdate {
    public static void updateString(String x) {
        x = x.concat("8");
    }
    public static void updateStringBuilder(StringBuilder y) {
        y = y.append("8");
    }
    public static void main(String[] args) {
        String x = "Java";
        StringBuilder y = new StringBuilder("Java");
        
    }
}
