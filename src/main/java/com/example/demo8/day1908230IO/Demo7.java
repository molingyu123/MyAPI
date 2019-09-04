package com.example.demo8.day1908230IO;

import com.alibaba.druid.sql.visitor.functions.Char;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 字符输入流---Reader 超类是一个抽象类
 * java.io.Reader
 * FileReader ：文件字符输入流，将硬盘中的数据以字符的方式读取到内存中
 */
public class Demo7 {
    public static void main(String[] args) throws IOException {
        // 创建FileReader 对象在构造方法中传入文件
        FileReader fileReader = new FileReader("io.txt");
//        int len =0;
//        while ((len=fileReader.read())!=-1){
//            System.out.print((char)len);
//        }

        int len2 =0;
        // 指定读取字符的个数
        char[] chars = new char[100];
        while ((len2=fileReader.read(chars))!=-1){
            System.out.println(new String(chars,0,len2));
        }

        fileReader.close();
    }
}
