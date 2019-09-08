package com.example.demo8.changeIO;

import java.io.*;

/**
 * 转换输出流--- extends Writer
 *   是字符流通字节的桥梁，父类中的所有方法都可以使用
 *
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        // 这个时候就出现 了乱码的现象
        writeGBK();
    }

    private static void writeUTF() throws IOException {
        // 不指定字符编码，默认使用utf-8
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("io2.txt"));
        outputStreamWriter.write("测试utf-8");
        outputStreamWriter.flush();
        outputStreamWriter.close();
    }


    private  static void writeGBK() throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("io2.txt"),"GBK");
        outputStreamWriter.write("测试GBK");
        outputStreamWriter.flush();
        outputStreamWriter.close();
    }
}
