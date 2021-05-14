package com.lab.test_cdc;

import com.lab.cdc.JsonThread;
import java.util.concurrent.FutureTask;
import org.junit.Test;

public class Test_JsonThread {
    @Test
    public void test() {
        // Json 資料網址
        String path= "https://www.cdc.gov.tw/TravelEpidemic/ExportJSON";
        // 建立 task 工作, 工作內容是 new JsonThread(path)
        FutureTask<String> task = new FutureTask<>(new JsonThread(path));
        // 建立執行緒來執行 task 的工作
        new Thread(task).start();
        try {
            // 利用 get() 來得到工作回報
            String json = task.get(); // 取得 json 資料
        } catch (Exception e) {
        }
    }
}
