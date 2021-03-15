package com.ocp.day10;

public class Son extends Father {

    public Son() {
        System.out.println("兒子被建立");
    }
    
    @Override
    public void hobby() {
        //super.hobby();
        System.out.println("LoL");
    }
    
}
