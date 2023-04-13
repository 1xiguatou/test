package com.srz.pkg;

import java.util.Arrays;

//import java.util.Scanner; //推荐这种方式导入包
//import java.util.*;  //不建议这种
public class Import01 {
    //使用系统提供的Arrays类 来实现数组的自动排序
    public static void main(String[] args) {

        int[] arr = {5, 6, -1, 77, 32};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
