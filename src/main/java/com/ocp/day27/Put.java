package com.ocp.day27;

public class Put implements Runnable {
    private Cookies cookies;

    public Put(Cookies cookies) {
        this.cookies = cookies;
    }
    
    @Override
    public void run() {
        for(int i=1;i<=cookies.getAmount();i++) {
            cookies.put(i);
        }
    }
    
}
