package com.srz.pkg.super_;

public class A {

    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public A() {
    }

    public A(int n1, int n2, int n3, int n4) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
    }

    public A(int n1) {
        this.n1 = n1;
    }

    public void cal(){
        System.out.println("调用父类的cal()方法");
    }

    public void test100() {

    }

    protected void test200() {

    }

    void test300() {

    }

    private void test400() {
    }
}
