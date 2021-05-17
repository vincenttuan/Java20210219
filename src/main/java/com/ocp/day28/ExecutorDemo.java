package com.ocp.day28;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executor;

class MyExecutor implements Executor {

    @Override
    public void execute(Runnable command) {
        new Thread(command).start();
    }
    
}


public class ExecutorDemo {
    
    public static void main(String[] args) {
        
        Runnable r1 = () -> System.out.println(new Date());
        Runnable r2 = () -> System.out.println(new Random().nextInt(100));
        Executor exec = new MyExecutor();
        exec.execute(r1);
        exec.execute(r2);
        
        Executor exec2 = (command) -> new Thread(command).start();
        exec2.execute(r1);
        exec2.execute(r2);
        exec2.execute(() -> System.out.println("停電了"));
    }
    
}
