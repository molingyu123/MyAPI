package com.example.demo8.day190825Thread2;

/**
 * 线程休眠
 */
public class ThreadSleep {
    public static void main(String[] args){
        for(int i=0;i<60;i++){
            System.out.println(i);
            // 使用Thread 类sleep 方法让程序休眠1秒钟
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
