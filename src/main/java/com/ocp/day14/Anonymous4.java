package com.ocp.day14;

interface Sub {
    int calc(int x, int y);
}

class SubImpl implements Sub {
    @Override
    public int calc(int x, int y) {
        return x - y;
    }
}

public class Anonymous4 {
    public static void main(String[] args) {
        Sub sub1 = new SubImpl();
        System.out.println(sub1.calc(10, 20));
        // 透過匿名內部類別
        Sub sub2 = new Sub() {
            @Override
            public int calc(int x, int y) {
                return x - y;
            }
        };
        System.out.println(sub2.calc(10, 20));
        // Java 8 Lambda
        Sub sub3 = (int x, int y) -> {return x + y;};
        Sub sub4 = (int x, int y) -> x + y; // 省去 return
        Sub sub5 = (x, y) -> x + y; // 超精簡寫法
        
        
    }
}
