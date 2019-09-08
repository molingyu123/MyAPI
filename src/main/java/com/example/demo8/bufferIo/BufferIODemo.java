package com.example.demo8.bufferIo;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲流demo
 * bufferedOutputStream --extends outputStream 字节流
 *
 *bufferedOutputStream---字节缓冲输出流
 */
public class BufferIODemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("io.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        // 这个时候数据在内存中
        bufferedOutputStream.write(12);
        // 调用flush方法将内存中的数据写入到内存中
        bufferedOutputStream.flush();
        // 最后关闭流 --关闭流可以不使用上面的flush()方法也可以将流中数据写入到硬盘中
        bufferedOutputStream.close();
    }
}
