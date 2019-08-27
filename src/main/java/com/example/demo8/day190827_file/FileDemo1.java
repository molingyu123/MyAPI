package com.example.demo8.day190827_file;

import java.io.File;

/**
 * file 判断功能的方法
 *      boolean exists() 判断文件或目录是否实际存在
 *      isDirectory() 是否为目录
 *      isFile() 是否为文件
 */
public class FileDemo1 {
    public static void main(String [] args){
        show01();
    }

    /**
     * 判断构造方法中的路径是否存在
     *     存在：true,
     *     不存在：false
     */
    public static void show01(){
        File file = new File("C:\\Users\\mly\\Desktop\\map.txt");
        System.out.println(file.exists());

        File file1 = new File("C:\\Users\\mly\\Desktop\\map2.txt");
        System.out.println(file1.exists());

        File file2 = new File("C:\\Users\\mly\\Desktop\\map.txt");
        System.out.println(file2.isDirectory());
        System.out.println(file2.isFile());
    }
}
