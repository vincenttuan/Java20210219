package com.lab.cdc;

import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.Callable;

// 負責抓取網路 json 資料
public class JsonThread implements Callable<String>{
    private String path; // json 網路路徑位置

    public JsonThread(String path) {
        this.path = path;
    }
    
    @Override
    public String call() throws Exception {
        URL url = new URL(path); // 建立 URL 物件
        // \A 這個 pattern 代表的是全部選擇
        // 透過 Scanner 可以將網路串流(openStream())變成字串
        String json = new Scanner(url.openStream()).useDelimiter("\\A").next();
        return json;
    }
    
}
