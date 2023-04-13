package com.srz.pkg.modifier;

public class Test {

    public static void main(String[] args) {
        A a = new A();
        a.m1();
        a.m2();
        a.m3();
        System.out.println(a.n1 + " " + a.n2 + " " + a.n3);// 无法访问private n4，但是a调用的方法中可以访问
        B b = new B();
        b.say();
    }
}
