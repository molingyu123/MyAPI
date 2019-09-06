package com.example.demo8.propertis;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * 使用properties 中load 方法配合字符输出流合字节输入流读取文件从硬盘中读取到内存中
 * 可以通过符号对其不想添加数据过滤 ---FileReader 使用# 在文件中
 * 使用 FileInputStream 不能读取含有中文的文件会乱码
 *
 * 使用load 方法都用字符流--可以读取中文文件避免了乱码
 */
public class PropertiesDemo3 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("prop3.txt"));
//        properties.load(new FileInputStream("prop3.txt"));

        Set<String> stringSet= properties.stringPropertyNames();
        for(String key:stringSet){
            String value = properties.getProperty(key);
            System.out.println("key:"+key+";"+"value:"+value);
        }
    }
}
