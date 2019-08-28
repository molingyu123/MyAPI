package com.example.demo8.recursion190828;

import java.io.File;

/**
 * 对demo4 中的添加一个条件只需要.java 文件结尾的
 */
public class RecursionDemo5 {
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
                //下面的几句写的啰嗦可以换成链式编程的方式
////                String name = file1.getName();//获取文件的名称
////                String path = file1.getPath();// 路径
//                String s = file1.toString();
//                boolean b=s.endsWith(".java");
//                if(b){
//                    System.out.println(file1);// 否则打印
//                }

                /////////链式编程如下
                if(file1.getName().toLowerCase().endsWith(".java")){
                    System.out.println(file1);
                }

            }
        }
    }
}
