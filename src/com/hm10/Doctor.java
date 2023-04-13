package com.hm10;

import javax.print.Doc;
import java.util.Objects;

public class Doctor {
    private String name;
    private int age;
    private double sal;
    private String gender;
    private String job;

    public Doctor(String name, int age, double sal, String gender, String job) {
        this.name = name;
        this.age = age;
        this.sal = sal;
        this.gender = gender;
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

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        //o的运行类型必须是Doctor 否则就无法比较
        if (!(o instanceof Doctor))
            return false;
        Doctor dc = (Doctor)o;
        return this.age == dc.getAge() && this.gender == dc.getGender() &&
                this.job == dc.getJob() &&
                this.name == dc.getName() && this.sal == dc.getSal();
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Doctor doctor = (Doctor) o;
//        return age == doctor.age &&
//                Double.compare(doctor.sal, sal) == 0 &&
//                Objects.equals(name, doctor.name) &&
//                Objects.equals(gender, doctor.gender) &&
//                Objects.equals(job, doctor.job);
//    }

}
