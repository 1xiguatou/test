package com.properties_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * 演示使用Properties类创建配置文件，修改配置文件内容
 * */
public class Properties03 {
    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();

        //创建配置文件的属性
        //如果没有Key 那么就创建
        //如果有key，那么就修改值
        properties.setProperty("charset","utf8");
        properties.setProperty("user","汤姆"); //注意保存时，是中文的unicode编码
        properties.setProperty("pwd","12345");

        //将k-v存储到文件中即可
        properties.store(new FileWriter("src\\mysql2.properties"),"hello world"); //第二项是注释信息
        System.out.println("保存配置文件成功~");

    }
}
