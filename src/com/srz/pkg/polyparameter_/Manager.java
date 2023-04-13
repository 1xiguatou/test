package com.srz.pkg.polyparameter_;

public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getAnnual() {
        return super.getAnnual() + bonus;
    }

    public String manage() {
        return "经理" + getName() + "正在管理工作...";


    }

}
