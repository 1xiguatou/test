package com.srz.pkg.polyarr_;

public class PolyArray {
    //应用实例：创建一个Person对象，2个Student对象，2个Teacher对象，统一放在数组里，并调用每个对象的say方法。

    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("jack", 18, 100);
        persons[2] = new Student("simth", 19, 70);
        persons[3] = new Teacher("king", 50, 25000);
        persons[4] = new Teacher("kit", 40, 20000);

        for (int i = 0; i < persons.length; i++) {

            //persons[i]的编译类型都是Person，运行类型根据实际情况由JVM判断
            //System.out.println(persons[i].say());;//动态绑定机制
            //调用特有方法  判断类型 然后向下转型

            if (persons[i] instanceof Student) {
                System.out.println(persons[i].say());
                ((Student) persons[i]).learn();
            } else if (persons[i] instanceof Teacher) {
                System.out.println(persons[i].say());
                ((Teacher) persons[i]).teach();
            } else {
                System.out.println(persons[i].say());
            }
        }
    }
}
