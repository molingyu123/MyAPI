package com.example.demo8.day1908230IO;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO 流 I:input ---读取  需要将内存东西读取曾现出来
 *      O:output-- 输出(写入) --将文件写入到硬盘中
 *      主要分为：字节流： inputStream ,OutputStream
 *
 *               字符流  Reader  Writer
 *
 *     字节流：一切皆为字节(文本，视屏，音频,图片）  可以读取任意的文件
 *  OutputStream ---表示输出字节流所有的超类
 *    FileOutputStream --- 文件字节输出流
 *
 *    写入数据的原理:java程序---》JVM （java虚拟机) ---os（操作系统）-->os 调用写数据的方法，---把数据写入到文件中
 *
 *    字节输出流的使用(步骤):
 *    1.创建一个FileOutputStream 对象，构造方法中传递写入数据的目的地
 *    2.调用FileOutputStream 对象中的方法write 把数据写入到文件中
 *    3.释放资源，关闭流(流使用会占用一定的内存)
 */
public class Demo01 {
    public static void main(String[]args) throws IOException {
        FileOutputStream fileOutputStream  = new FileOutputStream("C:\\Users\\mly\\Desktop\\mm.txt");
        /**
         * 当写入的字符在 0-127之间 则记事本在打开的时候会查询ascII 表
         * 其它值则会查询系统默认的中文系统示GBK
         */
        fileOutputStream.write(97);// 97 --->a
        fileOutputStream.close();
        System.out.println("写入成功");
    }

}
