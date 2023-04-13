package com.srz.pkg.polyparameter_;

public class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public String work() {
        return "员工" + getName() + "正在工作...";
    }

    public double Annual() {
        return super.getAnnual();
    }


}
