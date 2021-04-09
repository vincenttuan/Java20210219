package com.ocp.day16;

public class SexMain {
    public static void main(String[] args) {
        //checkSex(1);
        checkSex(Sex.man);
    }
    public static void checkSex(int value) {
        switch(value) {
            case Sex.man:
                System.out.println("我是男生");
                break;
            case Sex.female:
                System.out.println("我是女生");
                break;
        }
    }
}
