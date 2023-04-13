package com.srz.pkg.Object_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person p1 = new Person("srz", 22, "boy");
        Person p2 = new Person("srz", 22, "boy");
        Person p3 = new Person("bt", 22, "boy");
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }
}

class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (this instanceof Person) {
            Person p = ((Person)obj);
            return this.getName() == p.getName() && this.getAge() == p.getAge() && this.getGender() == p.getGender();
        }
        return false;
    }
}
