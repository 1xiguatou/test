package com.hm13;

public class Student extends Person {
    private String stu_id;

    public Student(String name, int age, String sex, String stu_id) {
        super(name, age, sex);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public void study() {
        System.out.println("我承诺，我会好好学习");
    }

    @Override
    public String play() {
        setHobby("足球");
        return super.play();
    }

    public void printInfo() {
        System.out.println("学生的信息如下：");
        super.printInfo();
        System.out.println("学号：" + getStu_id());
        study();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id='" + stu_id + '\'' +
                '}' + super.toString();
    }
}
