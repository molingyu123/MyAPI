package com.webSocket.FileUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 文件上传的服务器端
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8887);
        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();
        File file = new File("C:\\Users\\mly\\Pictures\\server");
        if(!file.exists()){
            file.mkdirs();
        }

        // 优化文件名称规则


        // 本地流
        FileOutputStream fileOutputStream = new FileOutputStream(file+"\\a6.gif");
        OutputStream os = socket.getOutputStream();
        int len =0;
        byte [] bytes = new byte[1024];
        while ((len=is.read(bytes))!=-1){
             fileOutputStream.write(bytes,0,len);
        }
        os.write("上传成功".getBytes());


        fileOutputStream.close();
        socket.close();
        serverSocket.close();
    }

}
