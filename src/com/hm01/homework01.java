package com.hm01;

public class homework01 {
    public static void main(String[] args) {

        Person[] p = {new Person("simth", 17, "工人"),new Person("srz", 22, "student"),
                new Person("bt", 23, "worker")};

        new Person().BubbleSort_Age(p);
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].toString());
        }
    }
}

class Person{
    private String name;
    private int age;
    private String job;

    public Person() {
    }

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void BubbleSort_Age(Person[] p){

        for (int i = p.length-1; i > 0 ; i--) {
            for (int j = 0; j < i ; j++) {
                if (p[j].getAge() < p[j+1].getAge()){
                    Person temp = p[j];
                    p[j] = p[j+1];
                    p[j+1] = temp;
                }
            }
        }
    }

    public void BubbleSort_Name(Person[] p){

        for (int i = p.length-1; i > 0 ; i--) {
            for (int j = 0; j < i ; j++) {
                if (p[j].getName().length() < p[j+1].getName().length()){
                    Person temp = p[j];
                    p[j] = p[j+1];
                    p[j+1] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
