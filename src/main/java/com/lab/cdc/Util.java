package com.lab.cdc;

// 工具類別

import com.google.gson.Gson;
import java.util.concurrent.FutureTask;

public class Util {
    // 將 json 的字串轉成 CDC[] 陣列
    public static CDC[] getCdcs() {
        // Json 資料網址
        String path= "https://www.cdc.gov.tw/TravelEpidemic/ExportJSON";
        // 建立 task 工作, 工作內容是 new JsonThread(path)
        FutureTask<String> task = new FutureTask<>(new JsonThread(path));
        // 建立執行緒來執行 task 的工作
        new Thread(task).start();
        try {
            // 利用 get() 來得到工作回報
            String json = task.get(); // 取得 json 資料
            // 將 json 的字串轉成 CDC[] 陣列, 利用 Gson
            CDC[] cdcs = new Gson().fromJson(json, CDC[].class);
            return cdcs;
        } catch (Exception e) {
        }
        return null;
    }
    
}
