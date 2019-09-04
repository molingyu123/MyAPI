package com.example.demo8.day1908230IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 字符流 ---Reader
 * 使用字节流读取中文，一个中文占用2个字节---gbk
 *                  utf----占用3个字节
 *  因为使用字节流读取中文会产生乱码--所以java 为我们提供了字符流
 */
public class Demo6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("io.txt");
        int len =0;
        while ((len=fis.read())!=-1){
            System.out.println(len);
        }
        fis.close();
    }
}
