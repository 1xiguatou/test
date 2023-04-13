package com.srz.pkg.dynamic_;

public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum());  //40 -> 30
        System.out.println(a.sum1()); //30 => 20

        //动态绑定机制：
        //1.当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
        //2.当调用对象属性的时候，没有动态绑定机制，哪里声明，哪里使用
        //可以理解为方法前面有个this
    }
}

class A {
    public int i = 10;

    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

class B extends A {
    public int i = 20;

//    public int sum() {
//        return i + 20;
//    }

//    public int sum1() {
//        return i + 10;
//    }

    @Override
    public int getI() {
        return i;
    }
}