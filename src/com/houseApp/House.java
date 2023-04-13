package com.houseApp;

import java.util.Scanner;

public class House {
    private int id;
    private String name;
    private String phone;
    private String address;
    private double mon_rant; //月租
    private String state; //状态 已出租 未出租
    public House[] houseinfo = new House[10000];
    private int index = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    public House(){}
    public House(int id,String name, String phone, String address, double mon_rant, String state) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.mon_rant = mon_rant;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMon_rant() {
        return mon_rant;
    }

    public void setMon_rant(double mon_rant) {
        this.mon_rant = mon_rant;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void listHouse(){
        System.out.println("编号\t房主\t电话\t地址\t月租\t状态（已出租/未出租）");
        if (index == 0)
            return;
        for (int i = 0; i < index; i++) {
            System.out.println(houseinfo[i].id+'\t'+houseinfo[i].name+'\t'+houseinfo[i].phone
                    +'\t'+houseinfo[i].mon_rant+'\t'+houseinfo[i].state);
        }
    }

    public void Add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("姓名：");
        String name = sc.next();
        System.out.println("电话：");
        String phone = sc.next();
        System.out.println("地址：");
        String address = sc.next();
        System.out.println("月租：");
        double mon_rant = sc.nextDouble();
        System.out.println("状态（未出租/已出租）：");
        String state = sc.next();
        houseinfo[index] = new House(index,name, phone, address, mon_rant, state);
        index++;
        System.out.println("-------------------添加完成----------------------");
    }

    public void search(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入查找的id：");
        int num = scanner.nextInt();
        for (int i = 0; i <= index; i++) {
            if (num == houseinfo[i].id){
                System.out.println(getId() + '\t' + getName() + '\t' + getPhone() + '\t' + getAddress() + '\t'
                        + getMon_rant() + '\t' + getState());
                return;
            }
        }
        System.out.println("--------------没有该房屋------------");
    }
}
