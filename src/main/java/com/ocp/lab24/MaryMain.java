package com.ocp.lab24;

public class MaryMain {
    public static void main(String[] args) {
        Runnable job1 = new Programming();
        Runnable job2 = new Report();
        Thread mary = new Thread(job1, "Mary");
        mary.start();
    }
}
