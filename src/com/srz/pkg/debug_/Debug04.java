package com.srz.pkg.debug_;

import java.util.Arrays;

public class Debug04 {
    //断电可以在debug的过程中动态下断点
    //演示执行到下一个断点
    public static void main(String[] args) {
        int arr[] = {5,12,7,2,4};

        //想看一下sort方法底层的实现，用debug的方法追踪 F7跳入
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println("hello100");
        System.out.println("hello200");
        System.out.println("hello300");
        System.out.println("hello400");
        System.out.println("hello500");
        System.out.println("hello600");
        System.out.println("hello700");
        System.out.println("hello800");
    }

}
