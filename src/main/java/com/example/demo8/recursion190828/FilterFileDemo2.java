package com.example.demo8.recursion190828;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * 使用匿名内部类的方式过滤
 */
public class FilterFileDemo2 {

    public static void main(String []args){
        File file=new File("C:\\Users\\mly\\Desktop\\");
        getAllFiles(file);
    }

    public static void getAllFiles(File file){
        // 使用匿名内部类的方式
//        File[] files= file.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                if(pathname.isDirectory()){
//                    return true;
//                }
//                return pathname.getName().toLowerCase().endsWith(".java");
//            }
//        });
        // 第二种的过滤方式
//        File [] files = file.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".java");
//            }
//        });

        //lambda 表达式
        File [] files;
        files = file.listFiles((File d, String name)-> new File(d,name).isDirectory() || name.toLowerCase().endsWith(".java"));

        for(File file1:files) {
            if (file1.isDirectory()) {
                getAllFiles(file1);
            } else {
                System.out.println(file1);
            }

        }
    }
}
