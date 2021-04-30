package com.ocp.day22;

public class ScoreRangeException extends Exception {

    public ScoreRangeException(int score) {
        super(score + " 沒有在 0~100 之間");
    }
    
    public void 怎麼辦() {
        System.out.println("請重新輸入");
    }
    
}
