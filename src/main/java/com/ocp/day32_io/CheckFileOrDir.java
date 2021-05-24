package com.ocp.day32_io;

import java.io.File;

public class CheckFileOrDir {
    public static void main(String[] args) {
        String path1 = "src/main/java/com/ocp/day32_io/res";
        String path2 = "src/main/java/com/ocp/day32_io/res/num.txt";
        System.out.println(new File(path1).isDirectory());
        System.out.println(new File(path1).isFile());
        System.out.println(new File(path2).isDirectory());
        System.out.println(new File(path2).isFile());
        
    }
}
