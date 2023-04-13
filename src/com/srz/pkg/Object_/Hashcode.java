package com.srz.pkg.Object_;

public class Hashcode {
    public static void main(String[] args) {
      AA aa = new AA();
      AA aa2 = new AA();
      AA aa3 = aa;
      //可以当做地址来看 但实际上不是地址
      System.out.println("aa,hashcode = " + aa.hashCode());
      System.out.println("aa2,hashcode = " + aa2.hashCode());
      System.out.println("aa3,hashcode = " + aa3.hashCode());

    }
}


class AA{}