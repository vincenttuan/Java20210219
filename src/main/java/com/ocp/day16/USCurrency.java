package com.ocp.day16;

// PENNY=1, NICLE=5, DIME=10, QUARTER=25
// USCurrency.PENNY
public enum USCurrency {
    PENNY(1), NICLE(5), DIME(10), QUARTER(25);
    
    private int value;

    private USCurrency(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
