package com.ocp.day33_io;

import java.io.BufferedReader;
import java.io.FileReader;


public class BigDataBufferedReader {
    public static void main(String[] args) {
        String filePath = "src/main/java/com/ocp/day33_io/1000 Sales Records.csv";
        try(FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);) {
            
            String data = null;
            // 逐行將資料讀取出來
            while ((data = br.readLine()) != null) {                
               // 逐行印出
                System.out.println(data);
            }
            
        } catch (Exception e) {
        }
    }
}
