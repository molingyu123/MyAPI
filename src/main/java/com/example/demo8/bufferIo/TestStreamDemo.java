package com.example.demo8.bufferIo;

import java.io.*;

/**
 * 测试速度
 * 未使用缓冲流读取的速度需要在1000左右的毫秒
 * 使用缓冲流读取只要20豪秒
 */
public class TestStreamDemo {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\mly\\Pictures\\b.jpg");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\mly\\Pictures\\copy\\dc.jpg");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        int len =0;
        // 一次读取的字节数
        byte[] bytes = new byte[1000];
        while ((len=bufferedInputStream.read(bytes))!=-1){
            // 将写入的数组字节数，指定写入的 位置从0到结束
            bufferedOutputStream.write(bytes,0,len);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
        long stopTime = System.currentTimeMillis();
        System.out.println(stopTime-startTime);
    }
}
