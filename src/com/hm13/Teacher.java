package com.hm13;

public class Teacher extends Person {
    private int work_age;

    public Teacher(String name, int age, String sex, int work_age) {
        super(name, age, sex);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    @Override
    public String play() {
        setHobby("象棋");
        return super.play();
    }

    public void teach() {
        System.out.println("我承诺。我会认真教学");
    }

    public void printInfo() {
        System.out.println("教师的信息如下：");
        super.printInfo();
        System.out.println("工龄：" + getWork_age());
        teach();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "work_age=" + work_age +
                '}' + super.toString();
    }
}
