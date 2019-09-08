package com.example.demo8.changeIO;

import java.io.*;

/**
 * 文件的转换
 */
public class DemoTest {
    public static void main(String[] args) throws IOException {

        long startTime = System.currentTimeMillis();

        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("io.txt"),"gbk");

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("io2.txt"),"utf-8");

        int len =0;
        while ((len=inputStreamReader.read())!=-1){
            outputStreamWriter.write(len);
        }
        outputStreamWriter.close();
        inputStreamReader.close();
        long stopTime = System.currentTimeMillis();
        System.out.println(stopTime-startTime);

    }
}
