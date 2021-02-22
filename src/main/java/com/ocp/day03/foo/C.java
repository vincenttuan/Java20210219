package com.ocp.day03.foo;

import com.ocp.day03.bar.A;

public class C extends A {
    void i_want_money() {
        // 因為 money 的存取權限是 protected
        // C 可透過 extends 就可以存取
        System.out.println(money);
    }
}
