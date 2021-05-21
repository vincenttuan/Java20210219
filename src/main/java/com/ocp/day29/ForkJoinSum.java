package com.ocp.day29;

import java.util.concurrent.RecursiveTask;

class SumTask extends RecursiveTask<Long> {
    private long [] numbers;
    private int from;
    private int to;

    public SumTask(long[] numbers, int from, int to) {
        this.numbers = numbers;
        this.from = from;
        this.to = to;
    }
    
    @Override
    protected Long compute() {
        // 當資料數量 <= 3 才會計算
        if(to - from <= 3) {
            long total = 0;
            for(int i = from ; i < to ; i++) {
                total += numbers[i];
            }
            System.out.printf("from: %d, to: %d, total: %d\n", from, total, total);
            return total;
        } else { // 將任務一分為二
            int middle = (from + to) / 2;
            System.out.printf("Left from: %d, to: %d\n", from, middle);
            SumTask taskLeft = new SumTask(numbers, from, middle);
            System.out.printf("Right from: %d, to: %d\n", middle, to);
            SumTask taskRight = new SumTask(numbers, middle, to);
            taskLeft.fork(); // 拆分
            taskRight.fork();  // 拆分
            return taskLeft.join() + taskRight.join();
        }
    }
    
}

public class ForkJoinSum {
    
}
