package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Homework03 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        Employee jack = new Employee("jack", 650);
        Employee tom = new Employee("tom", 1200);
        Employee smith = new Employee("smith", 2900);

        hashMap.put(jack.getName(),jack.getSal());
        hashMap.put(tom.getName(),tom.getSal());
        hashMap.put(smith.getName(),smith.getSal());
        System.out.println(hashMap);

        hashMap.put(jack.getName(),2600);
        System.out.println(hashMap);
        Set set = hashMap.entrySet();
        for (Object o : set) {
            Map.Entry entry = (Map.Entry)o;
            entry.setValue((int)entry.getValue() + 100);
        }
        System.out.println(hashMap);

        for (Object o : set) {
            Map.Entry entry = (Map.Entry)o;
            System.out.println(entry.getKey());
        }
        for (Object o : set) {
            Map.Entry entry = (Map.Entry)o;
            System.out.println(entry.getValue());
        }
    }
}

class Employee{
    private String name;
    private int sal;

    public Employee(String name, int sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
}
