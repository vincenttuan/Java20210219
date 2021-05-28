package com.ocp.day34_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileStreamCopy {
    public static void main(String[] args) throws IOException {
        String o_url = "src/main/java/com/ocp/day33_io/car.jpg"; // 來源端
        String d_url = "src/main/java/com/ocp/day34_nio/car.jpg"; // 目的端
        Path source = Paths.get(o_url);
        Path dest = Paths.get(d_url);
        Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Copy OK");
        
    }
}
