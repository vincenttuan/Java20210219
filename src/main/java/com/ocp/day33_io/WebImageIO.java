package com.ocp.day33_io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;


public class WebImageIO {
    public static void main(String[] args) throws Exception {
        String filePath = "src/main/java/com/ocp/day33_io/car.jpg";
        String path = "https://image.u-car.com.tw/theme/5E0A5AE9-9A99-491A-A1E6-0159BDFC3E1E.jpg";
        URL url = new URL(path);
        try(InputStream is = url.openStream();
            FileOutputStream fos = new FileOutputStream(filePath);) {
            
            byte[] buffer = new byte[1];
            while (is.read(buffer) != -1) {
                fos.write(buffer);
            }
            System.out.println("寫檔完成!");
        } catch (Exception e) {
        }
        
    }
}
