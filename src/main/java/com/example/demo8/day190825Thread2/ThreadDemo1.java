package com.example.demo8.day190825Thread2;

/**
 * 继承Thread 获取线程的名称
 */
public class ThreadDemo1 extends Thread {
    @Override
    public void run(){
        // 重写run 方法
        System.out.println("当前线程名称:"+Thread.currentThread().getName());
    }

}
