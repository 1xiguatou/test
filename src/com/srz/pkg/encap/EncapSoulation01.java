package com.srz.pkg.encap;

public class EncapSoulation01 {
    public static void main(String[] args) {
        Person person = new Person("simith",26,15000,0);
        person.info();
    }
}

class Person {
    /**
     * 设置属性 姓名 年龄 工资
     * 要求不能随便查看人的年龄，工资等隐私，并对设置的年龄进行合理的验证，年龄合理就设置 不合理默认值。年龄在1-120之间。
     * 年龄 工资等隐私不能直接查看，姓名的长度在2-6字符之间
     */

    public String name;
    private int age;
    private double sal;
    private int admin;
    //使用快捷键进行创建get 和set方法

    public Person() {
    }

    public Person(String name, int age, double sal, int admin) {
//        this.name = name;
//        this.age = age;
//        this.sal = sal;
//        this.admin = admin;
        //如果直接设置 那么之前的验证则会失效
        this.setName(name);
        this.setAdmin(admin);
        this.setSal(sal);
        this.setAge(age);
    }

    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>=2 && name.length()<=6) {
            this.name = name;
        }else {
            System.out.println("名字长度不在2-6之间，默认为null");
            this.name = null;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >=0 && age<=120) {
            this.age = age;
        }else {
            System.out.println("设置的年龄不在1-120之间，默认成18");
            this.age = 18;
        }
    }

    public double getSal() {
        if (this.admin == 1){
            return sal;
        }else {
            System.out.println("无权查看工资");
            return 0;
        }
    }

    public void setSal(double sal) {
        //增加验证信息才能查看薪水
        this.sal = sal;
    }

    public void info() {
        System.out.println("name = " + getName() + " age = " + getAge() + " sal = " + getSal() + " admin = "+getAdmin());
    }
}