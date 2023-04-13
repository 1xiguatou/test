package com;

import java.util.ArrayList;
import java.util.Comparator;

public class generic_ {
    public static void main(String[] args) {
        Employee srz = new Employee("srz", 20000, new MyDate(2000, 3, 1));
        Employee bt = new Employee("bt", 20000, new MyDate(2000, 8, 28));
        Employee zqz = new Employee("srz", 20000, new MyDate(2000, 02, 1));

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(srz);
        employees.add(bt);
        employees.add(zqz);

        System.out.println(employees);

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int nameMinus = o1.getName().compareTo(o2.getName());

                if (nameMinus != 0)
                    return nameMinus;

                return o1.getBirthday().compareTo(o2.getBirthday());

            }
        });
        System.out.println("=========排序后");

        System.out.println(employees);

    }
}

class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate implements Comparable<MyDate> {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(MyDate emp) {
        int yearMinus = year - emp.year;
        if (yearMinus != 0)
            return yearMinus;

        int monthMinus = month - emp.month;
        if (monthMinus != 0)
            return monthMinus;

        int dayMinus = day - emp.day;
        return dayMinus;

    }


}