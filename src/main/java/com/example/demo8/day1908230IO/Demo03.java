package com.example.demo8.day1908230IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 数据的追加和换行写
 */
public class Demo03 {
    public static void main(String[] args) throws IOException {
        /**
         * tue --拼接上之前的文件中的内容
         * false---会将源文件删除重新创建并写入到文件中
         */
//        FileOutputStream fileOutputStream=new FileOutputStream(new File("io.txt"),false);
//        fileOutputStream.write(97);
//        fileOutputStream.close();

        method2();



        System.out.println("ok");
    }

    private static void method2() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File("io.txt"),true);
        for(int i=0;i<10;i++){
            fileOutputStream.write("你好".getBytes());
            fileOutputStream.write("\r\n".getBytes());

        }
        fileOutputStream.close();
    }
}
