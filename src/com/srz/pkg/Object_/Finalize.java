package com.srz.pkg.Object_;

public class Finalize {
    public static void main(String[] args) {
        Car bmw = new Car("宝马");

        //这是 Car对象就是一个垃圾，垃圾回收期就会回收（销毁）对象，在小会堆向前，会滴爱用该对象的finalize方法
        //，程序员就可以在finalize中，写自己的业务逻辑代码（比如释放资源：数据库链接，或者打开文件）
        //,如果不重写finalize方法,那么就会调用Object类的finalize，即默认处理 什么也不做
        //，如果程序员重写了finalize，就可以实现自己的逻辑

        //回收不是实时的 有自己的GC算法，也可以通过System.gc()主动触发回收

        bmw = null;
        System.gc();//主动调用垃圾回收器
        System.out.println("程序退出了...");
    }
}
class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("销毁汽车" + name);
        System.out.println("释放了某些资源...");
    }
}