package com.srz.pkg.poly_.detail_;

public class PolyDetail_02 {
    public static void main(String[] args) {
        Base base = new Sub();
        System.out.println(base.count); //? 看编译类型：10  属性看编译类型 因为属性没有重写一说
        Sub sub = new Sub();
        System.out.println(sub.count); //20
    }
}

class Base{
    int count = 10;
}

class Sub extends Base{
    int count = 20;
}
