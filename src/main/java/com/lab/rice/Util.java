package com.lab.rice;

import com.google.gson.Gson;
import java.util.concurrent.FutureTask;

public class Util {
    public static Rice[] getRices() {
        String path = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx";
        RiceJsonThread r1 = new RiceJsonThread(path);
        FutureTask<String> task = new FutureTask<>(r1);
        new Thread(task).start();
        try {
            String json = task.get();
            Rice[] rices = new Gson().fromJson(json, Rice[].class);
            return rices;
        } catch (Exception e) {
            System.out.println("資料無法取得, " + e);
        }
        return null;
    }
}
