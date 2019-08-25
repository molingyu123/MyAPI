package com.example.demo8.day190825Thread2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程安全问题的出现
 * 实现runnable 接口创建多线程的好处:
 *   1.避免了单继承的局限性
 *      一个类只能继承一个类，类继承了Thread 类就不能继承其它的类
 *       实现runnable 接口，还可以继承其它的类，实现其它的接口
 *   2.增强了程序的扩展性，把设置线程任务和开启新线程进行了分离(解耦）
 *      实现类中，重写了run 方法：用来设置线程任务
 *      创建Thread类对象，调用start方法用来开启新线程
 */
public class ThreadSafty implements Runnable {
    // 卖票案列:3个卖票人员同时卖票
    // 定义一个多线程共享票源
    private int ticket =100;
    // 多态方法创建锁
    Lock l = new ReentrantLock();

    // 设置线程任务
    @Override
    public void run() {
        //根据线程数量来判断大于多少
        while (true){
            // 判断必须写在无限循环的内部
            //写在外部回出现访问不存在资源问题
            if(ticket>4){
                // 上锁
                l.lock();
                // 中间问题被安全的锁住
                System.out.println(Thread.currentThread().getName()+""+"正在卖票:"+ticket);
                ticket--;
            }else{
                break;
            }
        }
    }
}
