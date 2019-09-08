package com.webSocket;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Tcp 通信的客户端，向服务器发送请求，给服务器发送数据，读取服务器回写的数据
 *     表示客户端的类:
 *        java.net.Socket :此类实现客户端套接字，套接字示两台机器间通信的端点
 *        套接字：包含了ip 地址和端口号的网络单位
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        // 创建一个客户端对象Socket ，构造方法绑定服务器的ip 地址和端口号
        Socket socket = new Socket("127.0.0.1",8887);
        // 使用socket 对象方法中getOutputStream（） 获取网络字节输出流OutputStream 对象
        OutputStream outputStream = socket.getOutputStream();
        // 使用流的中方法给服务器写数据
        outputStream.write("你好服务器".getBytes());
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        // 因为发送的字节量少这边就一次读取完
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));
        // 释放资源
        socket.close();

    }
}
