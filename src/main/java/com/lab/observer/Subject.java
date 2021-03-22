package com.lab.observer;

public interface Subject {
    void add(Observer observer); // 訂閱
    void remove(Observer observer); // 取消訂閱
    void notifyObserver(String data); // 通知 Observer
}
