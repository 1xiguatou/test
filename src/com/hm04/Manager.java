package com.hm04;

import java.util.Scanner;

public class Manager extends Worker{

    private double bonus;

    public Manager(String name, double daySal, int workDay) {
        super(name, daySal, workDay);
        setGrade(1.2);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSal() {
        setPost("经理");
        System.out.println(getPost()+getName() + "的工资为" + (getDaySal()*getWorkDay()*getGrade() + bonus));
    }
}
