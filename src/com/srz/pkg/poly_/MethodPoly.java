package com.srz.pkg.poly_;

public class MethodPoly {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();


        //方法重载体现出多态（多种形态）
        System.out.println(b.sum(10,20));
        System.out.println(b.sum(10,20,30));

        //方法重写体现出多态
        a.say();
        b.say();
    }
}

class A {
    public void say() {
        System.out.println("A类的say()被调用");
    }
}

class B extends A {

    public int sum(int n1, int n2) {  //和下面方法构成重载
        return n1 + n2;
    }

    public int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public void say() {
        System.out.println("B类的say()被调用");
    }
}