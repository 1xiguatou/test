package com.srz.pkg.Object_;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        // == 可以判断基本类型和引用类型
        //引用类型判断的是地址
        System.out.println(a == b);
        System.out.println(a == c);

        B obj = a;
        System.out.println(obj == a);

        "hello".equals("abc");

        Integer integer1 = new Integer(1000);
        Integer integer2 = new Integer(1000);
        System.out.println(integer1 == integer2);
        System.out.println(integer1.equals(integer2));

        String srzedu1 = new String("srzedu");
        String srzedu2 = new String("srzedu");
        System.out.println(srzedu1 == srzedu2);
        System.out.println(srzedu1.equals(srzedu2));

    }

}
class B{}
class A extends B{}