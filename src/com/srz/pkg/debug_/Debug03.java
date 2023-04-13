package com.srz.pkg.debug_;

import java.util.Arrays;

public class Debug03 {
    public static void main(String[] args) {
        int arr[] = {5,12,7,2,4};

        //想看一下sort方法底层的实现，用debug的方法追踪 F7跳入
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
