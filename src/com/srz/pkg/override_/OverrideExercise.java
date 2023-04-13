package com.srz.pkg.override_;

public class OverrideExercise {
    public static void main(String[] args) {
        Person jack = new Person("jack", 18);

        Student xiaoming = new Student("xiaoming", 16, "320321", 99.9);

        System.out.println(jack.say());
        System.out.println(xiaoming.say());

    }
}
