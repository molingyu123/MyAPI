package com.webSocket.FileUpload;

import java.io.*;
import java.net.Socket;

/**
 * 文件上传的客户端 上传到服务器，读取服务器回写的数据
 * 数据源：
 * 目的地:服务器
 * 步骤：
 *   1.读取本地字节输入流:FileInputStream 对象，构造方法中绑定要读取的数据源
 *   2.创建一个客户端Socket 对象，构造方法中绑定服务器的ip 地址和端口号
 *   3.使用Socket 中的方法getOutputStream，获取网络字节输出流OutputStream 对象
 *   4.使用本地字节输入流FIleInputStream 对象中的方法read ,读取本地文件
 *   5.使用网络字节输出流OutputStream 对象中的方法Write ，把读取到的文件上传到服务器
 *   6.获取socket字节输入流对象getInputStream（）
 *   7.获取服务器发送的消息
 *   8.释放资源
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\mly\\Pictures\\a6.gif");
        Socket socket = new Socket("localhost",8887);
        OutputStream os = socket.getOutputStream();
        int len =0;
        byte [] bytes = new byte[1024];
        while ((len=fileInputStream.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        // 上面循环进入到了死循环进入了阻塞的状态
        // 通过一个结束的标记告诉服务器已经结束了
        socket.shutdownOutput();

        // 回写服务器发送的消息
        InputStream is = socket.getInputStream();
        while ((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        socket.close();
        fileInputStream.close();
    }
}
