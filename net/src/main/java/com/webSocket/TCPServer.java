package com.webSocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * tcp 通信的服务端 接收客户端的请求，读取客户端发送的数据，给客户端回写数据
 *
 *   构造方法：
 *      SereverSocket(int port) 创建绑定到特定端口服务器套接字
 *      服务端必须明确一件事情，必须知道是那个客户端请求的服务器
 *      所以可以使用accept 方法获取到请求的客户端对象socket
 *
 *    成员方法:
 *      accept() 侦听并接受此套接字的连接
 *
 *    服务器步骤:
 *      创建对象并和系统要指定的端口号
 *      使用accpet 方法获取到请求客户端对象Socket
 *      使用流获取客户的端发送的数据
 *      使用客端的流的对象再回写数据
 *      释放资源
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8887);
        Socket socket =serverSocket.accept();
        // 使用客户端中的输入流用于读取用户发送过来的数据
        InputStream is =socket.getInputStream();
        byte[] bytes = new byte[1024];
        // 因为发送的字节量少这边就一次读取完
        int len = is.read(bytes);
        // 回写：使用客户端中的输出流用于恢复客端发送来的消息
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("收到".getBytes());

        System.out.println(new String(bytes,0,len));
        socket.close();
        serverSocket.close();

    }
}
