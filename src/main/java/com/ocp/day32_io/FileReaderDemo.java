package com.ocp.day32_io;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        String path = "src/main/java/com/ocp/day32_io/data.txt";
        FileReader fr = null;
        
        try {
            fr = new FileReader(path);
            // code here ....
            char[] buffer = new char[1];
            while (fr.read(buffer) != -1) {                
                System.out.print(buffer[0]);
            }
            
        } catch (IOException e1) {
            System.out.println(e1);
        } finally {
            if(fr != null) {
                try {
                    fr.close();
                } catch (IOException e2) {
                    System.out.println(e2);
                }
            }
        }
        
    }
}
