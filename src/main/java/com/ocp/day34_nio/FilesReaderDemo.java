package com.ocp.day34_nio;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesReaderDemo {
    public static void main(String[] args) {
        Path path = Paths.get("src/main/java/com/ocp/day34_nio/1000 Sales Records.csv");
        
        // Files.newBufferedReader
        try(BufferedReader reader = Files.newBufferedReader(path)) {
            reader.lines().forEach(System.out::println);
        } catch (Exception e) {
        }
    }
}
