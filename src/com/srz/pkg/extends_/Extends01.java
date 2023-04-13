package com.srz.pkg.extends_;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 8;
        pupil.setScore(98);

        Graduate graduate = new Graduate();
        graduate.name = "大明";
        graduate.age = 21;
        graduate.setScore(60);

        pupil.testing();
        pupil.showInfo();
        System.out.println("=============================");
        graduate.testing();
        graduate.showInfo();
    }
}
