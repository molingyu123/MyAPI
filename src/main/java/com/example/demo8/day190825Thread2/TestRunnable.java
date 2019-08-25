package com.example.demo8.day190825Thread2;

/**
 * 测试实现runnable 接口带来的问题
 */
public class TestRunnable {
    public static void main(String [] args){
        // 创建接口实现类
        ThreadSafty threadSafty = new ThreadSafty();
        // 创建线程
        Thread thread1= new Thread(threadSafty);
        Thread thread2= new Thread(threadSafty);
        Thread thread3= new Thread(threadSafty);
        Thread thread4= new Thread(threadSafty);

        //开启线程
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
