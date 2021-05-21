package com.ocp.day29;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/*
f(0) = 0
f(1) = 1
f(n) = f(n-1) + f(n-2)
*/
class Fibonacci extends RecursiveTask<Integer> {
    final int n;

    public Fibonacci(int n) {
        this.n = n;
    }
    
    @Override
    protected Integer compute() {
        if(n <= 1) {
            return n;
        }
        Fibonacci f1 = new Fibonacci(n - 1);
        Fibonacci f2 = new Fibonacci(n - 2);
        f1.fork();
        f2.fork();
        return f1.join() + f2.join();
    }
    
}

public class ForkJoinFibonacci {
    public static void main(String[] args) {
        // 0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233
        ForkJoinPool pool = new ForkJoinPool(4);
        int result = pool.invoke(new Fibonacci(7));
        System.out.println(result);
    }
}
