package com.example.demo8.recursion190828;

/**
 * 递归算法：
 *     递归分成:直接递归和间接的递归
 *           直接递归:---自己直接调用自己
 *           间接递归:---自己调用别人，但是别人的中的方法体内又调用自己的方法
 *    递归的限制条件：
 *       1.最大的调用次数
 *       2.栈内存的限制
 */
public class RecursionDemo1 {

    public static void main(String[] args){
       myMethod();
    }

    public static void myMethod(){
        System.out.println("我自己的方法");
   //        myMethod();  直接调用自己的方法
       herMethod();
    }

    /**
     * 通过别人调用的自己的方法
      */
    public static void herMethod(){
        System.out.println("他的方法");
        myMethod();
    }
}
