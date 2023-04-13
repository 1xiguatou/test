package com.srz.pkg.override_;

public class Dog extends Animal{


    //1.因为Dog是Animal的子类
    //2.Dog的cry方法和Animal的cry定义形式一样（名称 返回值 参数列表）
    //3.这时我们就说Dog的cry方法重写了Animal的cry方法
    public void cry(){
        System.out.println("小狗汪汪叫");
    }
    //子类方法的参数列表、方法名称要和父类的参数列表、方法名称完全一样
    public int call(int n){
        return 0;
    }
    // 子类方法的返回类型要和父类方法的返回类型一致或者是父类返回方法的子类
    public Object m1(){
        return null;
    }
    //或者是父类返回方法的子类,String是Object的子类
    public String m2(){
        return null;
    }
    // BBB 是 AAA的子类
    public BBB m3(){
        return null;
    }
    //子类方法不能缩小父类方法的访问权限 ： public > protected > 默认 > private
    //会报错 因为默认 比 protected的范围小
//     void m4(){
//
//    }
    //Public放大了范围 当然可以
    public void m4(){

    }
}
class AAA{

}
class BBB extends AAA{

}