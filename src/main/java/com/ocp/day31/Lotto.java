package com.ocp.day31;

public class Lotto {
    private int machineNumber;
    private int lottoNumber;

    public Lotto(int machineNumber, int lottoNumber) {
        this.machineNumber = machineNumber;
        this.lottoNumber = lottoNumber;
    }

    public int getMachineNumber() {
        return machineNumber;
    }

    public void setMachineNumber(int machineNumber) {
        this.machineNumber = machineNumber;
    }

    public int getLottoNumber() {
        return lottoNumber;
    }

    public void setLottoNumber(int lottoNumber) {
        this.lottoNumber = lottoNumber;
    }

    @Override
    public String toString() {
        return "Lotto{" + "machineNumber=" + machineNumber + ", lottoNumber=" + lottoNumber + '}';
    }
    
}
