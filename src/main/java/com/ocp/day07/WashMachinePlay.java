package com.ocp.day07;

public class WashMachinePlay {
    public static void main(String[] args) {
        WashMachine w1 = new WashMachine(1);
        w1.open();
        w1.putClothes();
        w1.close();
        w1.play();
        w1.water();
        w1.play();
    }
    
}
