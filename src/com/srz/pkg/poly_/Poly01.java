package com.srz.pkg.poly_;

public class Poly01 {
    public static void main(String[] args) {
        Master jack = new Master("jack");

        Cat xiaohua = new Cat("xiaohua");
        Fish huang = new Fish("huang");
        System.out.println("===========");
        jack.Feed(xiaohua,huang);

        System.out.println("===========");
        Dog hashiqi = new Dog("hashiqi");
        Bone gutou = new Bone("gutou");
        jack.Feed(hashiqi,gutou);

        System.out.println("============");
        Pig pig = new Pig("pig");
        Rice mifan = new Rice("mifan");
        jack.Feed(pig,mifan);

    }
}
