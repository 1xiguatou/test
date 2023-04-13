package com.srz.pkg.encap;

import javax.crypto.spec.PSource;

public class Account {
    String name;
    private double balance;
    private String password;

    public Account() {
    }

    public Account(String name, double balance, String password) {
        this.setName(name);
        this.setBalance(balance);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("姓名长度不在2-4之间，赋予默认值“”");
            this.name = "";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 20) {
            this.balance = balance;
        } else {
            System.out.println("输出的余额小于20,默认为20");
            this.balance = 20;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            System.out.println("密码长度必须为6位！默认为123456");
            this.password = "123456";
        }
    }

    public void getInfo() {
        System.out.println(this.name + "的信息如下===============================");
        System.out.println("name = " + getName() + " balance = " + getBalance() + " password =" + getPassword());
    }
}
