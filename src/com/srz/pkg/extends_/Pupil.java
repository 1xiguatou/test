package com.srz.pkg.extends_;

public class Pupil {
    public String name;
    public int age;
    private int score;

    public Pupil() {
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void testing() {
        System.out.println("小学生 " + name + "正在考数学");
    }

    public void showInfo() {
        System.out.println("学生 " + name + " 年龄" + age + " 成绩" + score);

    }
}
