package com.srz.pkg.extends_.imporve_;

public class Student {
    public String name;
    public int age;
    private int score;


    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }


    public void showInfo() {
        System.out.println("学生 " + name + " 年龄" + age + " 成绩" + score);

    }
}
