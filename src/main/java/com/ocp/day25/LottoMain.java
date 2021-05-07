package com.ocp.day25;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LottoMain {
    public static void main(String[] args) {
        FutureTask<Integer> task = new FutureTask<>(new Lotto());
        new Thread(task).start();
        System.out.println("計算中...");
        
        try {
            System.out.println(task.get());
        } catch (InterruptedException ex) {
        } catch (ExecutionException ex) {
        }
        
        System.out.println("程式結束");
    }
}
