package com.ocp.lab24;

public class RaceMain {
    public static void main(String[] args) {
        Race race = new Race();
        Race race2 = new Race();
        Race race3 = new Race();
        // 設定執行緒名稱
        race.setName("烏龜");
        race2.setName("兔子");
        race3.setName("程咬金"); // 200~600可看到
        // 設定權限(預設=5, 範圍:1~10)
        race.setPriority(10);
        race2.setPriority(1);
        // 執行緒啟動
        race.start();
        race2.start();
    }
}
