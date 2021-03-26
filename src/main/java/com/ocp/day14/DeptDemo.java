package com.ocp.day14;

public class DeptDemo {
    public static void main(String[] args) {
        Dept dept = new Dept();
        Dept.Job job = dept.new Job();
        job.work();
    }
}
