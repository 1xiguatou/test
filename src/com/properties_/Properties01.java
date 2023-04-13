package com.properties_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Properties01 {
    public static void main(String[] args) throws IOException {


        //读取mysql.properties文件，并读取相应信息
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\mysql.properties"));
        String line = "";
        while ((line = bufferedReader.readLine())!= null){
            String[] str = line.split("=");
            //如果我们指定要求获取ip
            if ("ip".equals(str[0]))
                System.out.println(str[0] + ":" + str[1]);
        }

        bufferedReader.close();
    }
}
