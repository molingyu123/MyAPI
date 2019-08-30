package com.example.demo8.day1908230IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02 {
    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream(new File("io.txt"));
        fileOutputStream.write(100);
        fileOutputStream.write(200);
        byte[] bytes={-1,-2,-3,4,5,0};
        // 写入字节数组
//        fileOutputStream.write(bytes);
//        fileOutputStream.close();
        System.out.println("ok");

        //写入指定字节数组
//        fileOutputStream.write(bytes,2,2);
//        fileOutputStream.close();
        System.out.println("df");

        // 写入字符串方法
        String str = "你好中国";
        byte[] bytes1=str.getBytes();
        System.out.println(bytes1);
        fileOutputStream.write(bytes1);
        fileOutputStream.close();

    }
}
