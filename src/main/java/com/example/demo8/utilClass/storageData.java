package com.example.demo8.utilClass;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.sql.Array;

/**
 * 该类用于存储大数值运算针对于Long int 不能存储的数据
 */
public class storageData {

    public static void main(String [] args){

    }
    public static byte[] readBytes(InputStream in , long length) throws Exception{
        //创建以字节数组的管道
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //设置管道的字节流速
        byte[] bytes = new byte[1024];
        //创建计数器变量
        int read =0;
        //判断当读写完成后关闭流的管道，反回当前管道读取到字节流
        while(read<length){

            int cur = in.read(bytes,0,(int)Math.min(1024,length-read));
            if(cur<0){
                break;
            }
            read +=cur;
            byteArrayOutputStream.write(bytes,0,cur);

        }
        return byteArrayOutputStream.toByteArray();
    }



}
