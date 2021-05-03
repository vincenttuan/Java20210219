package com.ocp.lab24;

public class MaryMain {
    public static void main(String[] args) {
        Runnable job1 = new Programming();
        Runnable job2 = new Report();
        Thread mary = new Thread(job1, "Mary");
        mary.start();
        
        Runnable[] runnables = {job1, job2};
        Runnable job3 = new Jobs(runnables);
        Thread helen = new Thread(job3, "Helen");
        helen.start();
    }
}
