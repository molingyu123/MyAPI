package com.example.demo8.bufferIo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 字符缓冲输入流  --BufferedReader extends Reader
 *  拥有一个特有的方法 String readline 读取一行文本
 */
public class BufferReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("io2.txt"));
        int len =0;
        while ((len=bufferedReader.read())!=-1){
            // 使用readLine 读取一行的文本
            bufferedReader.readLine();
            System.out.println(len);
        }
        bufferedReader.close();
    }
}
