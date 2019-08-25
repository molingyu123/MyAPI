package com.example.demo8.day190825Thread2;

/**
 * 测试获取线程的名称
 */
public class GetThreadName {
    public static void main(String[] args){

        //获取Thread 的子类
        ThreadDemo1 threadDemo1 = new ThreadDemo1();
        // 开启线程
        threadDemo1.start();
        // 匿名调用
        new ThreadDemo1().start();
        new ThreadDemo1().start();
        System.out.println("输出名称:");
        System.out.println(Thread.currentThread().getName());
    }
}
