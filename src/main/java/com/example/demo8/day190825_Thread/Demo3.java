package com.example.demo8.day190825_Thread;

import java.util.Objects;

/**
 * null 异常抛出
 */
public class Demo3 {
    public static void main(String [] args){
        // 查看引用类视是否为Null的专用方法
        method(null);
    }

    private static void method(Object e){
        Objects.requireNonNull(e,"传递的对象值是null");
    }
}
