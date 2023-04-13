package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;

public class hmk {
    public static void main(String[] args) {
        Method.Memory();
    }
}

class Method{
    public static void Memory(){
        Scanner scanner = new Scanner(System.in);
        //n总共的数
        int n = scanner.nextInt();

        HashSet hashSet = new HashSet();


        for (int i = 0; i < n; i++) {
            hashSet.add((Integer)scanner.nextInt());
        }
        //m询问的次数
        int m = scanner.nextInt();
        int count = 0;
        String[] str = new String[m];
        int index = 0;
        while (count < m){
            int temp = scanner.nextInt();
            if (hashSet.contains(temp)){
                str[index++] = "YES";
            }
            else {
                str[index++] = "NO";
            }
            count++;
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        //12
        //12
        System.out.println();
    }
}
