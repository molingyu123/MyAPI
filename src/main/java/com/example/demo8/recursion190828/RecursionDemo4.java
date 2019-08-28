package com.example.demo8.recursion190828;

import java.io.File;

/**
 * 打印多级目录
 */
public class RecursionDemo4 {
    public static void main(String []args){
        File file=new File("C:\\Users\\mly\\Desktop\\");
        getAllFiles(file);
    }

    public static void getAllFiles(File file){
       File[] files= file.listFiles();
       for(File file1:files){
           if(file1.isDirectory()){// 如果是目录就继续的调用自己的方法继续循环打印
               getAllFiles(file1);
           }else{
               System.out.println(file1);// 否则打印
           }
       }
    }

}
