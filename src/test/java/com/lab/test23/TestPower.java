package com.lab.test23;

import com.ocp.day23.Power;
import org.junit.Assert;
import org.junit.Test;

public class TestPower {
    
    @Test // 測試 w
    public void testW() {
        Power power = new Power();
        int v = 10;
        int a = 100;
        int exp = 1000;
        int act = power.getW(v, a);
        Assert.assertEquals(exp, act);
    }
    
    
}
