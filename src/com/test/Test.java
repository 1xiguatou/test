package com.test;

import com.xiaoming.Dog;

public class Test {

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog);
        com.xiaoqiang.Dog dog1 = new com.xiaoqiang.Dog();  //必须要写全而且两个不能同时引入import
        System.out.println(dog1);


    }
}
