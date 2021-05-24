package com.ocp.day32_io;

import java.io.File;
import java.io.IOException;

public class CreateFolderAndFileDemo {
    public static void main(String[] args) {
        String path = "src/main/java/com/ocp/day32_io";
        String folderName = "res";
        String pathAddFolderName = path + File.separator + folderName;
        // File 檔案, 資料夾
        File folder = new File(pathAddFolderName);
        System.out.println(folder.exists());
        // 建立資料夾
        if(!folder.exists()) {
            boolean success = folder.mkdir();
            System.out.printf("%s 資料夾建立: %b\n", pathAddFolderName, success);
            if(success) {
                // 建立檔案
                String fileName = "num.txt";
                String fullName = pathAddFolderName + File.separator + fileName;
                File file = new File(fullName);
                try {
                    success = file.createNewFile();
                    System.out.printf("%s 檔案建立: %b\n", fullName, success);
                } catch (IOException e) {
                    System.out.println(e);
                }
                
            }
        }
    }
}
