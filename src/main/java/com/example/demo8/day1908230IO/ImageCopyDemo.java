package com.example.demo8.day1908230IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件复制的原理使用的字节流方式一读一写
 *
 */
public class ImageCopyDemo {
    public static void main(String[] args) throws IOException {
        // 监听读取的时间
        long time = System.currentTimeMillis();
        //C:\Users\mly\Pictures\\b.jpg
        //C:\Users\mly\Pictures\copy
        // 第一步读取
        FileInputStream fis = new FileInputStream("C:\\Users\\mly\\Pictures\\b.jpg");
        //写入对象
        FileOutputStream fos = new FileOutputStream("C:\\Users\\mly\\Pictures\\copy\\b.jpg");
//        int len =0;
//        while ((len=fis.read())!=-1){
//            fos.write(len);
//        }

        // 使用数组缓冲的方式提高读取的效率
        byte [] bytes = new byte[200];
        int len2=0;
        while ((len2=fis.read(bytes))!=-1){
            fos.write(bytes);
        }
        // 先关闭写入流--读完了不一定写完了
        fos.close();
        fis.close();
        long es = System.currentTimeMillis();
        System.out.println(es-time);
    }
}
