package com.ocp.day24;

public class Jobs implements Runnable {
    private Runnable[] runnables;

    public Jobs(Runnable[] runnables) {
        this.runnables = runnables;
    }

    @Override
    public void run() {
        for(Runnable r : runnables) {
            //new Thread(r).start();
            r.run();
        }
    }
}
