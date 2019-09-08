package com.example.demo8.bufferIo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 字节缓冲输入流 BUfferedInputStream extends InputStream
 *   同时拥有inputStream 常用的方法
 */
public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("io.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        // 一次读取一个
        //也可以使用数组来读取，提高读取的效率
        int len =0;
        while ((len=bufferedInputStream.read())!=-1){
            System.out.println(len);
        }
       bufferedInputStream.close();

    }
}
