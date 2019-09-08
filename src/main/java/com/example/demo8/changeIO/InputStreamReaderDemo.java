package com.example.demo8.changeIO;

import java.io.*;

/**
 * 读取的转换流 InputStreamReader extends reade
 *   是字节流向字符的桥梁
 *   把看不懂的转换成能看懂 的
 *   构造方法中的编码必须和文件的编码集相同否则会出现乱码
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws Exception {
        readerUTF();
    }

    private static void readerUTF() throws Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("io.txt"),"utf-8");
        int len =0;
        while ((len=inputStreamReader.read())!=-1){
            System.out.println((char)len);
        }
        inputStreamReader.close();
    }

    private static void readerGBK() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("io.txt"),"gbk");
        int len =0;
        while ((len=inputStreamReader.read())!=-1){
            System.out.println((char)len);
        }
        inputStreamReader.close();
    }

}
