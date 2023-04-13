package com.srz.pkg.super_;

public class B extends A {



    //super调用父类构造器的好处：父类的属性由父类初始化，子类的属性由子类初始化，分工明确
    public B(int n1, int n2, int n3, int n4, int n5) {
        super(n1, n2, n3, n4);
        this.n5 = n5;
    }
//    public int n1 = 10;
    public int n5 = 500;
    //1.super可以访问父类的属性，但不能访问私有属性 super.属性

    public void hi() {
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
    }
    //2.super可以访问父类的方法，但不能访问私有方法 super.方法

    public void hello(){
        super.test100();
        super.test200();
        super.test300();
    }
    //3.super可以访问父类的构造器，但有且仅能有一条 super(参数列表)
    public B(){
        super();
    }
    public B(int n1){
        super(n1);
    }
    public void cal(){
        System.out.println("调用子类的cal()方法");
    }
    public void sum(){
        //由于子类中没有cal()方法，因此子类中调用cal()方法有三种方式，
        System.out.println("调用子类的sum()方法");
        //直接cal()
        //规则:(1)先找子类有无，再找父类有无并能否访问，若父类无则报错，若父类有但是private则显示无法访问，如果父类没有再找
        //父类的父类 直到Object类

        //注意！！！！super的访问遵循就近原则
        cal();
        //cal() == this.cal
        this.cal();
        //super.cal()，规则不找子类，直接找父类，若父类无则报错，若父类有但是private则显示无法访问
        super.cal();

        //访问属性的规则和访问方法的规则是一样的
        // n1 == this.n1
        System.out.println(n1);
        System.out.println(this.n1);
        //直接找父类
        System.out.println(super.n1);
    }
}
