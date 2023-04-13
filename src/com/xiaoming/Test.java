package com.xiaoming;

import com.srz.pkg.modifier.A;

public class Test {
    public static void main(String[] args) {
        //同一个包下 只能访问public  不能访问 protected 默认的成员方法和属性，private
        A a = new A();
        System.out.println(a.n1);
        a.m1();
    }
}
