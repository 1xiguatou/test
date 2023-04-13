package com.properties_;

import com.srz.pkg.poly_.Fish;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Homework01 {
    public static void main(String[] args) throws IOException {
        String path1 = "D:\\mytemp";
        String path2 = "D:\\mytemp\\hello.txt";
        File file = new File(path1);

        if (file.exists()){
            System.out.println("已存在mytemp");
        }else {
            //mkidrs用于创建文件夹
            file.mkdirs();
        }

        File file1 = new File(path1,"hello.txt");
        if (file1.exists()){
            System.out.println("已存在hello.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));
            bufferedWriter.write("hello world~");
            bufferedWriter.close();
        }else {
            file1.createNewFile();
        }
    }
}
