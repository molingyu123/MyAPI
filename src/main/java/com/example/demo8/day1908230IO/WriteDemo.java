package com.example.demo8.day1908230IO;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符输出流的 Writer ---超类同时是一个抽象类
 * java.io.Writer
 * 子类：
 * java.io.FileWriter extends OutputStreamWriter extends Writer
 * FileWriter 作用：把内存中字符数据写入到文件中（硬盘）
 * 字符输出流的使用步骤:
 *   1.创建FileWriter 对象，构造方法中绑定要写入数据的目的低
 *   2.使用FileWriter 的方法write 把数据写入到内存缓冲区中(字符转换为字节的过程)
 *   3.使用FileWriter 的方法 flush 把内存缓冲区中的数据,刷新到文件中
 *   4.释放资源(会把内存缓冲区中的数据刷新到文件中）
 */
public class WriteDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("io2.txt");
        fileWriter.write(97);
        fileWriter.flush();
        fileWriter.close();// 使用close 后可以不使用flush(),关闭流的同时会自动帮你刷新
    }
}
