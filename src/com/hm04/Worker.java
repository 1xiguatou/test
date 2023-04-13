package com.hm04;

public class Worker {
    private String name;
    private double daySal;
    private int workDay;
    private double grade;
    private String post;

    public Worker(String name, double daySal, int workDay) {
        this.name = name;
        this.daySal = daySal;
        this.workDay = workDay;
    }

    public double getGrade() {
        return grade;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySal() {
        return daySal;
    }

    public void setDaySal(double daySal) {
        this.daySal = daySal;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    public void printSal(){
        System.out.println(getPost() + getName() + "的工资为" + (daySal*workDay));
    }
}
