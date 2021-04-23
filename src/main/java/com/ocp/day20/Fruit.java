package com.ocp.day20;

public class Fruit {
    private String name;
    private Integer amount; // 數量
    private Double price; // 價格

    public Fruit() {
    }

    public Fruit(String name, Integer amount, Double price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" + "name=" + name + ", amount=" + amount + ", price=" + price + '}';
    }
    
    
}
