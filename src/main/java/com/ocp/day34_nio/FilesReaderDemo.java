package com.ocp.day34_nio;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesReaderDemo {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src/main/java/com/ocp/day34_nio/1000 Sales Records.csv");
        
        // 1. Files.newBufferedReader
        /*
        try(BufferedReader reader = Files.newBufferedReader(path)) {
            reader.lines().forEach(System.out::println);
        } catch (Exception e) {
        }
        */
        
        // 2. Files.readAllLines (List 集合)
        //List<String> list = Files.readAllLines(path);
        //list.stream().forEach(System.out::println);
        
        // 3. Files.lines (Stream 串流)
        Files.lines(path).forEach(System.out::println);
        
    }
}
