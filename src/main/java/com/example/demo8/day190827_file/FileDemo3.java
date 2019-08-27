package com.example.demo8.day190827_file;

import java.io.File;

/**
 * 文件夹的遍历
 *   List() ---
 *   ListFiles()
 */
public class FileDemo3 {
    public static void main(String []args){
//        show01();
        show02();
    }

    /**
     * list --string [] 遍历能够获取隐藏的文件夹
     */
    private static void show01(){
        File file = new File("C:\\Users\\mly\\Desktop\\MyAPI");
        String[] strings = file.list();
        for(String s:strings){
            System.out.println(s);
        }
    }

    /**
     * 遍历所有的文件夹所有的目录文件
     */
    private static void show02(){
        File file= new File("C:\\");
        File[] files = file.listFiles();
        for(File file1:files){
            System.out.println(file1);
        }
    }
}
