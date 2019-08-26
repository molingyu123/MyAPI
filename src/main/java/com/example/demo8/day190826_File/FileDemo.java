package com.example.demo8.day190826_File;

import java.io.File;

/**
 *  java.io.file 类---基本介绍
 *   文件和目录路径名的抽象类表示形式
 *   java 把电脑种的文件和文件夹(目录封装未一个file 类，我们可以使用 file 类对文件和文件夹进行操作
 *   我们可以使用file 类的方法
 *   创建一个文件和文件夹
 *   删除一个文件和文件夹
 *   获取一个文件和文件夹
 *   判断文件和文件夹是否存在
 *   获取文件的大小
 *   File 类示要给于系统无关的类，任何的操作系统都可以使用这个类中的方法
 *   重点： 记住这三个单词
 *         file:文件
 *         directory:文件夹/目录
 *         path:路径
 */
public class FileDemo {
    public static void main(String[] args){
        /**
         * static String pathSeparator 与系统相关的路径分隔符，为了方便，它表示为一个字符串
         * static char pathSeparatorChar 与系统相关的路径分隔符
         *
         * static String separator 与系统相关的默认名称分隔符，为了方便，它表示为一个字符串
         * static char separatorChar 与系统有关的默认名称分隔符
         *
         * 操作路径不能将路径写死了
         * 用File.separator 表示
         */
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);
        //输出结果： ;--window 系统  linux 是个：冒号

        String separator = File.separator;
        System.out.println(separator);
        // 输出结果： windows---\  linux /


    }

}
