package com.ocp.day31;

public class Lotto {
    private int machineNumber;
    private int lottoNumber;
    private String threadName;

    public Lotto(int machineNumber, int lottoNumber, String threadName) {
        this.machineNumber = machineNumber;
        this.lottoNumber = lottoNumber;
        this.threadName = threadName;
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

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public String toString() {
        return "Lotto{" + "machineNumber=" + machineNumber + ", lottoNumber=" + lottoNumber + ", threadName=" + threadName + '}';
    }
    
    
}
