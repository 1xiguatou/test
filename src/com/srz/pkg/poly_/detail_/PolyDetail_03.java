package com.srz.pkg.poly_.detail_;

public class PolyDetail_03 {
    public static void main(String[] args) {
        BB bb = new BB();
        //AA instanceof BB 判断 AA是否是BB的运行类型类型或者是BB的运行类型的子类型
        System.out.println(bb instanceof BB); //?
        System.out.println(bb instanceof AA);

        AA aa = new BB();
        System.out.println(aa instanceof AA);  //判断的是运行类型
        System.out.println(aa instanceof BB);

        Object obj = new Object();
        System.out.println(obj instanceof AA);

        String str = "hello";
        //System.out.println(str instanceof AA);
        System.out.println(str instanceof Object);
    }
}

class AA {

}

class BB extends AA {

}