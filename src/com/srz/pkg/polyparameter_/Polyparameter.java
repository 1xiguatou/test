package com.srz.pkg.polyparameter_;

public class Polyparameter {
    public static void main(String[] args) {
        Employee e  = new Worker("srz",24000.6);
        Employee e1 = new Manager("123",24000,15000);

//        System.out.println(e.getAnnual());
//        System.out.println(e1.getAnnual());

        Test t1 = new Test();
        Test test = new Test();
        System.out.println(t1.showEmpAnnual(e));
        System.out.println(test.showEmpAnnual(e1));
//
        t1.testWork(e);
        test.testWork(e1);


    }
}
class Test{

    public String showEmpAnnual(Employee e){
        return e.getName() + "的工资是" + e.getAnnual();
    }

    public void testWork(Employee e){
        if (e instanceof Worker){
            System.out.println(((Worker) e).work());
        }else if (e instanceof Manager){
            System.out.println(((Manager)e).manage());
        }
    }
}
