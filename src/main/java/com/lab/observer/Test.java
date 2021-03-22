package com.lab.observer;

public class Test {

    public static void main(String[] args) {
        Subject news = new News();
        Observer user1 = new User("小明");
        Observer user2 = new User("小華");
        Observer user3 = new User("小英");
        // 訂閱
        news.add(user1);
        news.add(user2);
        news.add(user3);
        // 發送
        news.notifyObserver("我要吃上海水煎包");
        
        // 取消訂閱
        news.remove(user2);
        // 發送
        news.notifyObserver("我要吃蚵仔煎");
    }

}
