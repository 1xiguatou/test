package com.srz.pkg.extends_;

public class Base extends TopBase{
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    //如果父类不写Base(){}那么子类必须用super()指定具体调用哪个父类构造器
    public Base() {
        System.out.println("父类Base()被调用...");
    }

    public Base(String name) {
        System.out.println("父类的Base(String name)被调用");
    }

    public Base(String name, int age) {
        System.out.println("父类的Base(String name , int age)被调用");
    }

    //n4 为私有方法 虽然不能直接访问 但是可以通过公共的方法去访问
    public int getN4() {
        return n4;
    }

    public void test100() {
        System.out.println("test100...");
    }

    protected void test200() {
        System.out.println("test200...");
    }

    void test300() {
        System.out.println("test300...");
    }

    private void test400() {
        System.out.println("test400...");
    }

    public void accesstest400() {
        test400();
    }

}
