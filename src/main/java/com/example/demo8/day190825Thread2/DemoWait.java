package com.example.demo8.day190825Thread2;

/**
 * 线程的等待和唤醒
 */
public class DemoWait {
    public static void main(String[] args){

        // 创建锁对象,保证唯一
        final Object obj = new Object();

        // 创建一个顾客的线程
        new Thread(){
            @Override
            public void run(){
                //一直等着买包子
                while (true){
                    //保证等待和唤醒的线程只有一个执行
                    // 使用同步技术synchronized
                    synchronized (obj){
                        System.out.println("顾客1在消费");
                        // 调用等待方法
                        // 放弃cpu 的执行
                        // 进入到waiting 状态
                        try{
                            obj.wait();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                        // 唤醒后执行代码
                        System.out.println("包子好了,顾客1开始吃");
                    }
                    System.out.println("顾客1吃完了");
                    break;
                }
            }
        }.start();

        // 创建第二个顾客的线程
        new Thread(){
            @Override
            public void run(){
                //一直等着买包子
                int count=0;
                while (true){
                    //保证等待和唤醒的线程只有一个执行
                    // 使用同步技术synchronized
                    synchronized (obj){
                        System.out.println("顾客2在消费");
                        // 调用等待方法
                        // 放弃cpu 的执行
                        // 进入到waiting 状态
                        try{
                            obj.wait();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                        // 唤醒后执行代码
                        System.out.println("包子好了,顾客2开始吃");
                    }
                    if(count>2){
                        System.out.println("顾客2吃完了");
                        break;
                    }
                    count++;
                }
            }
        }.start();

        // 创建老板线程
        new Thread(){
            @Override
            public void run(){
                while (true){
                    // 花了一秒钟做包子
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    synchronized (obj){
                        System.out.println("老板把包子做好了");
                         obj.notify();// 随机唤醒一个
                        // 唤醒全部
//                        obj.notifyAll();
                    }
                }
            }
        }.start();

    }
}
