package com.webSocket.FileUpload02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * 文件上传的服务器端
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8887);

        // 让服务器一直处于监听状态
        while (true){
            Socket socket = serverSocket.accept();
            /**
             * 使用多线程提高程序的效率
             * 有一个客户端上传文件就开启一个线程，完成文件的上传
             */
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        InputStream is = socket.getInputStream();
                        File file = new File("C:\\Users\\mly\\Pictures\\server");
                        if(!file.exists()){
                            file.mkdirs();
                        }
                        /**
                         *  自定义文件的命名规则：防止文件同名
                         */
                        String fileName = System.currentTimeMillis()+new Random().nextInt(999)+".jpg";
                        // 本地流
                        FileOutputStream fileOutputStream = new FileOutputStream(file+"\\"+fileName);
                        OutputStream os = socket.getOutputStream();
                        int len =0;
                        byte [] bytes = new byte[1024];
                        while ((len=is.read(bytes))!=-1){
                            fileOutputStream.write(bytes,0,len);
                        }
                        os.write("上传成功".getBytes());
                        fileOutputStream.close();
                        socket.close();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }).start();
            // 服务器就不用关闭了
//            serverSocket.close();
        }
    }

}
