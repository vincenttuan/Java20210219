package com.ocp.day32_io;

import java.io.FileWriter;

public class FileWriterNewDemo {
    public static void main(String[] args) {
        String path = "src/main/java/com/ocp/day32_io/data.txt";
        // true  : 保留原檔案內容資料
        // false : 清除保留原檔案內容資料
        try(FileWriter fw = new FileWriter(path, true)) {
            fw.write("Hello"); // 寫入資料
            System.out.println("寫入成功 !");
        } catch (Exception e) {
        }
    }
}
