package com.example.demo8.day190825Thread2;

/**
 * 设置线程的名称
 */
public class MyThread extends Thread{

    public MyThread(){}

    public MyThread(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println("当前线程的名称:"+Thread.currentThread().getName());
    }
}
