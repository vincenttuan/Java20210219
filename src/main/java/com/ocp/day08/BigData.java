package com.ocp.day08;
import java.util.Date;
public class BigData {
    private String data;
    private String author = "交易所";
    private String version = "1.0";
    
    // 物件初始區段
    {
        if(new Date().getTime() % 2 == 0) {
            data = "盤中資料";
        } else {
            data = "盤後資料";
        }
    }

    @Override
    public String toString() {
        return "BigData{" + "data=" + data + ", author=" + author + ", version=" + version + '}';
    }
    
}