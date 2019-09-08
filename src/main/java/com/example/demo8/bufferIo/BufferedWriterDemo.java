package com.example.demo8.bufferIo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符缓冲输出流 extends Writer
 *
 * 拥有一个特有的方法
 *    void newline()--写入一个行分隔符
 */
public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("io2.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for(int i=0;i<10;i++){
            bufferedWriter.write("写入aaaaaaaaaaaadd");
            // 使用换行符号，写入一次换行一次
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
