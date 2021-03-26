package com.ocp.day14;

interface Game {
    void print();
}

public class Anonymous2 {
    public static void main(String[] args) {
        Game game1 = new Game(){
            @Override
            public void print() {
                System.out.println("英雄聯盟");
            }
        };
        game1.print();
        // Java 8 Lambda
        Game game2 = () -> System.out.println("英雄聯盟");
        game2.print();
    }
}
