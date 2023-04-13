package com.hm05;

public class Homework05 {
    public static void main(String[] args) {
        Worker srz = new Worker("srz", 10000);
        Peasant bt = new Peasant("bt", 8000);
        Teacher lj = new Teacher("lj", 11000, 10, 200);
        Scientist zqz = new Scientist("zqz", 12000, 100000);
        Waiter simth = new Waiter("simth", 7000);
        srz.setSalMonth(15);
        bt.setSalMonth(13);
        lj.setSalMonth(14);
        zqz.setSalMonth(12);
        simth.setSalMonth(16);
        srz.printSal();
        bt.printSal();
        lj.printSal();
        zqz.printSal();
        simth.printSal();

    }
}
