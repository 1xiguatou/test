package com.hm10;

public class Homework10 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("srz", 18, 10000, "男", "dc");
        Object doctor1 = new Doctor("srz", 18, 10000, "男", "dc");
        System.out.println(doctor.equals(doctor1));
    }
}
