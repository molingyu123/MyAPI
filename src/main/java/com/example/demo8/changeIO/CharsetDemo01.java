package com.example.demo8.changeIO;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * FileReader 可以读取默认文件的格式--utf-8
 *            如果读取系统默认的编码格式--gbk 则就会产生乱码
 *
 */
public class CharsetDemo01 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\mly\\Desktop\\aa.txt");
        int len =0;
        while ((len=fileReader.read())!=-1){
            System.out.println(len);
        }
        fileReader.close();
    }
}
