package com.srz.pkg.modifier;

public class A {

    public int n1 = 100;        //同类 同包 子类 不同包
    protected int n3 = 100;     //同类 同包 子类
    int n2 = 100;               //同类 同包
    private int n4 = 100;       //同类

    public void m1() {
        System.out.println("n1 =" + n1 + " n2 =" + n2 + " n3=" + n3 + " n4 =" + n4);
    }
    protected void m2() {
        System.out.println("protected");
    }
    void m3() {
        System.out.println("默认");
    }
    private void m4() {
        System.out.println("private");
    }
}
