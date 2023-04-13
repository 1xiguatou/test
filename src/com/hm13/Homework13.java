package com.hm13;

public class Homework13 {
    public void BubbleSort(Person[] p) {
        for (int i = p.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (p[j].getAge() < p[j + 1].getAge()) {
                    Person temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                }
            }
        }
    }

    public void test(Person person) {
        if (person instanceof Student) {
            ((Student) person).study();
        } else if (person instanceof Teacher) {
            ((Teacher) person).teach();
        } else {
            System.out.println("do nothing!");
        }
    }


    public static void main(String[] args) {
        Person s1 = new Student("srz", 22, "boy", "123456");
        Person s2 = new Student("bt", 24, "boy", "123222");

        Person t1 = new Teacher("lj", 25, "girl", 1);
        Person t2 = new Teacher("wmq", 23, "girl", 2);

        Person[] p = {s1, s2, t1, t2};

        Homework13 hm = new Homework13();
        hm.BubbleSort(p);
        //输出学生和老师的信息
//        for (int i = 0; i < p.length; i++) {
//            p[i].printInfo();
//            System.out.println("==================");
//        }

        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].toString());
        }
        for (int i = 0; i < p.length; i++) {
            hm.test(p[i]);
        }
    }
}
