package com.example.demo8.day1908230IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * inputStream 读取指定数量的字节
 */
public class Demo5 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("io.txt");
        // 2表示存取读取的有效字节个数
        byte[] bytes =new byte[20];

        int len =0;
//        System.out.println(len);
//        System.out.println(Arrays.toString(bytes));
//        System.out.println(new String(bytes));

        while ((len=fis.read())!=-1){
            int lens =fis.read(bytes);
            System.out.println(lens);
        }
        fis.close();

    }
}
