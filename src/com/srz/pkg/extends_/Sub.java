package com.srz.pkg.extends_;

public class Sub extends Base {

    public Sub() {
        //super(); 隐藏了super（） 默认调用父类无参构造器
        super("simth");
        System.out.println("子类Sub()被调用...");
    }

    public Sub(String name) {
        super("jack");
        System.out.println("子类Sub(String name)被调用");
    }

    public Sub(String name , int age){
        //1.调用父类无参构造器
//        super();
        //2.调用父类带一个参数的构造器
//        super(name);
        //3.调用父类带两个参数的构造器
        super(name, age);
        System.out.println("子类Sub(String name , int age)被调用");
    }

    public void sayOk() {
        //n3虽然为默认 但是在一个包下
        System.out.println("n1 = " + n1 + " n2 = " + n2 + " n3 = " + n3);

        //通过公共的方法去访问n4
        System.out.println(getN4());

        test100();
        test200();
        test300();
        //通过公共的方法去访问私有方法test400()
        accesstest400();

    }


}
