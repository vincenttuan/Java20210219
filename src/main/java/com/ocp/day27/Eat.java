package com.ocp.day27;

public class Eat implements Runnable {
    private Cookies cookies;

    public Eat(Cookies cookies) {
        this.cookies = cookies;
    }
    
    @Override
    public void run() {
        for(int i=1;i<=cookies.getAmount();i++) {
            cookies.eat(i);
        }
    }
    
}
