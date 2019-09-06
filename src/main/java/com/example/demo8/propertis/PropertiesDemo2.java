package com.example.demo8.propertis;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * 使用Properties 中stroe 方法配合字符输出流，字节输出流
 */
public class PropertiesDemo2 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("a","123");
        properties.setProperty("c","123");
        properties.setProperty("d","123");
        properties.setProperty("e","123");
        properties.setProperty("f","123");
        // 字符流
//        FileWriter fileWriter = new FileWriter("prop.txt");
//        properties.store(fileWriter,"save data test");

        // 字节流
        FileOutputStream fileOutputStream = new FileOutputStream("prop3.txt");
        properties.store(fileOutputStream,"test2");
        fileOutputStream.close();

//        fileWriter.close();
    }
}
