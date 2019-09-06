package com.example.demo8.day1908230IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * jdk7 异常的新特性
 * 普通:try{}catch(){}--普通的捕获异常的方式
 * jdk7: try(){}catch(){}---新特性
 *   新特性:将产生异常的对象放到try 后面扩号中进行处理
 *
 *  jdk9 特性又在此基础又优化了
 */
public class IOException2 {
    public static void main(String[] args) {
        try(
            // 第一步读取
            FileInputStream fis = new FileInputStream("C:\\Users\\mly\\Pictures\\b.jpg");
            //写入对象
            FileOutputStream fos = new FileOutputStream("C:\\Users\\mly\\Pictures\\copy\\b.jpg");)
        {
            // 流的作用域就只当前的范围有用--不需要按照以往的方式通过全局变量的方式来解决因作用域的问题
            // 监听读取的时间
            long time = System.currentTimeMillis();
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
        }catch (java.io.IOException e){
           e.printStackTrace();
        }

    }
}
