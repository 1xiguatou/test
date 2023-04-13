package com.hm05;

public class Scientist extends Employee{
    private double bonus;

    public Scientist(String name, double sal, double bonus) {
        super(name, sal);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSal() {
        System.out.println("科学家 " + getName() + "的全年工资为" + (getSal()*getSalMonth() + bonus));
    }
}
