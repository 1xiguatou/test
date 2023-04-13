package com.hm05;

public class Teacher extends Employee{
    private int classDay;
    private int classSal;

    public Teacher(String name, double sal, int classDay, int classSal) {
        super(name, sal);
        this.classDay = classDay;
        this.classSal = classSal;
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    public int getClassSal() {
        return classSal;
    }

    public void setClassSal(int classSal) {
        this.classSal = classSal;
    }

    @Override
    public void printSal() {
        System.out.println("教师 "+ getName() + "的全年工资为" + (getSal()*getSalMonth() + classSal*classDay ));
    }
}
