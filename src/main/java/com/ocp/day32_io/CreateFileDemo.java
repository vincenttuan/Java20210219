package com.ocp.day32_io;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo {
    public static void main(String[] args) {
        String path = "src/main/java/com/ocp/day32_io";
        String name = "data.txt";
        String pathAddName = path + File.separator + name;
        
        File file = new File(pathAddName);
        System.out.printf("%s 是否存在? %b\n", pathAddName, file.exists());
        
        // 若檔案不存在就建立新檔
        if(!file.exists()) {
            System.out.print("建立檔案: ");
            try {
                boolean success = file.createNewFile();
                System.out.println(success);
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
