package com.example.demo8.day1908230IO;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符输出流写数据的其它方法
 *
 */
public class WriterDemo3 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("io2.txt");

        // 写入字符数组
        char[] chars = {'a','b','3','g'};
        fileWriter.write(chars);

        // 写入字符串
        fileWriter.write("你好中国");

        // 写入指定字符串
        fileWriter.write("程序员",0,2);

        fileWriter.close();
    }
}
