package com.hm03;

import java.awt.event.ItemEvent;

public class Homework03 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("lj", 22, "Professor", 12000);
        Teacher teacher1 = new Professor("srz", 22, "Professor", 12000);
        Teacher teacher2 = new SubProfessor("bt", 22, "Professor", 11000);
        Teacher teacher3 = new Lecturer("zqz", 22, "Professor", 10000);
        System.out.println(teacher.introduce());
        System.out.println(teacher1.introduce());
        System.out.println(teacher2.introduce());
        System.out.println(teacher3.introduce());
    }
}

class Teacher{
    private String name;
    private int age;
    private String post;
    private double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String introduce(){
        return "姓名 = " + getName() + " 年龄 = " + getAge() + " 职称 = "+ getPost() + " 基本工资 = " + getSalary();
    }
}

class Professor extends Teacher{
    private double slaGrade = 1.3;

    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    public double getSlaGrade() {
        return slaGrade;
    }

    public void setSlaGrade(double slaGrade) {
        this.slaGrade = slaGrade;
    }

    @Override
    public String introduce() {
        return super.introduce() + " 工资级别 = " + getSlaGrade();
    }
}
class SubProfessor extends Teacher{
    private double slaGrade = 1.2;

    public SubProfessor(String name, int age, String post, double salary) {
        super(name, age, post, salary);

    }

    public double getSlaGrade() {
        return slaGrade;
    }

    public void setSlaGrade(double slaGrade) {
        this.slaGrade = slaGrade;
    }

    @Override
    public String introduce() {
        return super.introduce() +" 工资级别 = " + getSlaGrade();
    }
}

class Lecturer extends Teacher{
    private double slaGrade = 1.1;

    public Lecturer(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    public double getSlaGrade() {
        return slaGrade;
    }

    public void setSlaGrade(double slaGrade) {
        this.slaGrade = slaGrade;
    }

    @Override
    public String introduce() {
        return super.introduce() +" 工资级别 = " + getSlaGrade();
    }
}