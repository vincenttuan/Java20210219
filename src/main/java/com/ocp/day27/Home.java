package com.ocp.day27;

public class Home {
    public static void main(String[] args) {
        Cookies cookies = new Cookies(10);
        Thread master = new Thread(new Put(cookies));
        Thread dog = new Thread(new Eat(cookies));
        master.start();
        dog.start();
    }
}
