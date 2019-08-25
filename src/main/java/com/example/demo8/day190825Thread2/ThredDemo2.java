package com.example.demo8.day190825Thread2;

/**
 * 匿名内部类的方式实现多线程
 */
public class ThredDemo2 {
    public static void main(String[] args){
        //主线程优先级高所以会先执行
        new Thread(){
            @Override
            public void run(){
                for(int i=0;i<20;i++){
                    System.out.println("当前的线程名称:"+Thread.currentThread().getName());
                }
            }
        }.start();

        // 使用接口的方式
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<20;i++){
                    System.out.println("当前线程:"+Thread.currentThread().getName());
                }
            }
        }).start();

    }
}
