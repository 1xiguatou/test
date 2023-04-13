package com.srz.pkg.modifier;

public class B {

    public void say(){
        A a = new A();
        //同一个包下 只能访问public protected 默认的成员方法和属性,不能访问private
        System.out.println(a.n1 + " " + a.n2 + " " + a.n3);// 无法访问private n4，但是a调用的方法中可以访问

    }
}
