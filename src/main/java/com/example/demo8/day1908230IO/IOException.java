package com.example.demo8.day1908230IO;

import java.io.FileWriter;

/**
 * 处理流异常
 * 使用try {}catch{}
 * 通常我们处理异常都是使用try {}catch{} 来捕获我们可能发生的异常
 *
 */
public class IOException {
    public static void main(String[] args)  {
        //全局变量
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("io2.txt",true);
            for(int i=0;i<10;i++){
                fileWriter.write("hello world"+i+"\r\n");
            }
        } catch (java.io.IOException e) {
            // 可以编写异常的处理逻辑
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }

    }
}
