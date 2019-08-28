package com.example.demo8.recursion190828;

import java.io.File;

/**
 * 使用文件过滤器对上一个demo 优化
 * 过滤器就是用来过滤的
 *    java.io.FileFilter 接口--用于过滤文件对象的过滤器（file)
 *    有个抽象方法： 过滤文件的方法
 *    FileFilter
 *
 *    java.io.FilenameFilter
 *    FileNameFilter-- 文件名称过滤器--也是一个接口
 *      boolean accept(File dir,String name)
 */
public class FilterDemo6 {
    public static void main(String []args){
        File file=new File("C:\\Users\\mly\\Desktop\\");
        getAllFiles(file);
    }

    public static void getAllFiles(File file){
        File[] files= file.listFiles(new FileFilterImpl());
        for(File file1:files) {
            if (file1.isDirectory()) {
                getAllFiles(file1);
            } else {
                System.out.println(file1);
            }

        }
    }
}

