package com.srz.pkg.poly_.detail_;

public class PolyDetail {
    public static void main(String[] args) {

        //向上转型：父类的引用指向了子类的对象
        //语法： 父类类型尹永明 = new 子类类型（）
        Animal animal = new Cat();
        Object obj = new Cat(); //Object也是cat的父类
        //可以调用父类的所有成员
        //但是不能调用子类的特用的成员
        //因为在编译阶段，能调用哪些成员，是由编译类型来决定的
        animal.run();
        //animal.catchMouse 错误
        //最终的运行效果还要看子类的具体实现,即调用方法时，按照从子类开始查找方法
        animal.eat();


        //希望能够调用cat的特有方法
        //多态的向下转型
        //语法 子类类型 引用名 = （子类类型）父类引用；
        //cat的编译类型是Cat,运行类型还是Cat
        Cat cat = (Cat) animal;
        cat.catchMouse();
        //要求父类的引用必须指向的是当前目标类型的对象  animal指向的是Cat 才能转型为Cat，而不能转化成Dog

        //Dog dog = (Dog) animal;  导致编译错误



    }
}
