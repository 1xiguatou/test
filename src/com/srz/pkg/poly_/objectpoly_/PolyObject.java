package com.srz.pkg.poly_.objectpoly_;



public class PolyObject {
    public static void main(String[] args) {

        //体现对象多态特点


        //animal 编译类型是Animal 运行类型是Dog, 编译类型不可变，运行类型可变
        Animal animal = new Dog();

        //运行时，执行到改行的时候，animal的运行类型是dog，所以cry就是dog的cry
        animal.cry();

        //运行时，执行到改行的时候，animal的运行类型是Cat，所以cry就是Cat的cry
        animal = new Cat();
        animal.cry();
    }
}
