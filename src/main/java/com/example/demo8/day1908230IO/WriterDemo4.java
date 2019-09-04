package com.example.demo8.day1908230IO;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 续写和换行
 *
 * 换行：可以使用换行符号
 */
public class WriterDemo4 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("io2.txt",true);
        for(int i=0;i<10;i++){
            fileWriter.write("hello world"+i+"\r\n");
        }
        fileWriter.close();
    }
}
