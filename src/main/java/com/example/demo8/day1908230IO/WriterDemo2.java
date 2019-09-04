package com.example.demo8.day1908230IO;

import java.io.FileWriter;
import java.io.IOException;

/**
 * flush（） 和close ()区别
 *  flush() 刷新到缓冲区，流对象可以继续使用
 *  close() 先刷新缓冲区，然后通知系统释放资源，流对象不可以再接使用
 */
public class WriterDemo2 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("io2.txt");
        fileWriter.write(96);
//        fileWriter.flush();
        fileWriter.close();
        fileWriter.write(98);
//        fileWriter.close();// 使用close 后可以不使用flush(),关闭流的同时会自动帮你刷新
    }
}
