package com.properties_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * 演示使用Properties类读取配置文件
 * */
public class Properties02 {
    public static void main(String[] args) throws IOException {

        //1.创建Properties对象
        Properties properties = new Properties();
        //2.加载配置文件
        properties.load(new FileReader("src\\mysql.properties"));
        //3.把k-v显示到控制台
        properties.list(System.out);
        //4.根据key获取对应的值
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");
        System.out.println("user=" + user);
        System.out.println("pwd=" + pwd);



    }
}
