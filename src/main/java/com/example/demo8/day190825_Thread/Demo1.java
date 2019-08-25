package com.example.demo8.day190825_Thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 捕获异常
 * throwable :1.Exception --程序员能处理的错误
 *            2.Error --- 程序员不能处理的错误
 */
public class Demo1 {

    public static void main(String[] args){
        //异常演示
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try{
            Date date = simpleDateFormat.parse("2019-999");
        }catch (Exception e){
            System.out.println("不支持的日期格式,请检查");
        }
    }

}
