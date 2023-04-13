package com.srz.pkg.poly_;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //这么写的话代码会非常多且不易于管理，使用多态的话则非常容易
//    public void Feed(Dog dog, Bone bone) {
//        System.out.println("主人"+this.name+"给" + dog.getName() + "喂" + bone.getName());
//    }
//
//    public void Feed(Cat cat, Fish fish) {
//        System.out.println("主人"+this.name+"给" + cat.getName() + "喂" + fish.getName());
//    }

    //使用多态的话会非常清晰且容易管理，能统一的管理主人给动物喂食
    //animal 的编译类型是Animal，可以接受（指向）Animal的子类对象
    //food 的编译类型是Food，可以接受（指向）Food的子类对象
    public void Feed(Animal animal,Food food){
        System.out.println("主人"+this.name+"给" + animal.getName() + "喂" + food.getName());
    }

}
