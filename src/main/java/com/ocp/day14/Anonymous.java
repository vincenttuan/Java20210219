package com.ocp.day14;

interface Salary {
    int amount();
}

public class Anonymous {
    public static void main(String[] args) {
        Salary salary = new Salary(){
            @Override
            public int amount() {
                return 5_0000;
            }
        };
        Salary salary2 = new Salary() {
            @Override
            public int amount() {
                return 8_0000;
            }
        };
        System.out.println(salary.amount());
        System.out.println(salary2.amount());
    }
}
