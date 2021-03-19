package com.lab1;


public class Director extends Manager {

    private int stockOptions;

    public Director(int salary) {
        setSalary(salary);
    }

    public int getStockOptions() {
        return stockOptions;
    }

    public void setStockOptions(int stockOptions) {
        if(stockOptions > 0) {
            this.stockOptions = stockOptions;
        }
    }

}
