package com.hm05;

public class Employee {
    private String name;
    private double sal;
    private int salMonth;
    public Employee(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    public int getSalMonth() {
        return salMonth;
    }

    public void setSalMonth(int salMonth) {
        this.salMonth = salMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public void printSal(){
        System.out.println(getName() + "的全年工资为" + getSal()*getSalMonth());
    }

}
