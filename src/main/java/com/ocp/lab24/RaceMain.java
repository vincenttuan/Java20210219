package com.ocp.lab24;

public class RaceMain {
    public static void main(String[] args) {
        Race race = new Race();
        Race race2 = new Race();
        race.setName("烏龜");
        race2.setName("兔子");
        race.start();
        race2.start();
    }
}
