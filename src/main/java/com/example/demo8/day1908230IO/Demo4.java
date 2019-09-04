package com.example.demo8.day1908230IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * inputStream 字节输入流---超类
 *    定义了所有子类的方法
 *    int read()
 *    int read(byte[] b)
 *
 *    java.io.FileInputStream extends inputStream
 *
 *    把硬盘中数据读取到内存中使用
 *
 *    读取数据的原理：如何读取呢---由硬盘到内存
 *    java程序--》jvm-->os--->os读取数据的方法---》读取文件
 *
 */
public class Demo4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("io.txt");
        int len = 0;
        while ((len=fis.read())!=-1){
            System.out.println(len);
        }

        fis.close();

//        System.out.println(len);
    }



}
