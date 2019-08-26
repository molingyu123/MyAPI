package com.example.demo8.day190826_File;

import java.io.File;

/**
 * 路径： 绝对路径：--是一个完整的路径以盼复开始的路径
 *       相对路径：是一个简化的路径
 *              相对是指的是相对于当前项目的根目录
 *              如果使用当前项目的根目录，路径可以简化书写
 *              C：/123.text ---》123.text
 *        注意点：
 *           路径是不区分大小写的
 *           路径种的文件名称分隔符windows 使用反斜杠，反斜杠是转义字符，两个反斜杠代表一个普通的反斜杠
 */
public class FileDemo2 {
    public static void main(String[] args){
//        show01();
//        show02("c:","map.txt");
        show03();
    }

    /**
     *  File (String pathname) 通过将给定路径名字字符串转换为抽象路径名来创建一个新的File 实列
     *    参数：
     *       String pathname :字符串的路径名称
     *       路径可以是以文件结尾，也可也是以文件夹结尾
     *       路径可以是相对路径，也可以示绝对路径
     *       路径可以是存在，也可也是不存在
     *       创建File 对象，只是把字符串的路径封装为File 对象，不考虑路径的真假情况
     *
     *
     */
    private static void show01(){
        File file = new File("C:\\Users\\mly\\Desktop\\a.txt");
        System.out.println(file);
        System.out.println("----------------------");
        File file1 = new File("C:\\Users\\mly\\Desktop\\map.txt");
        System.out.println(file1);

        //写个相对路径的--指当前的项目与文件是属于同一个目录下的
        File file2 = new File("map.txt");
        System.out.println(file2);
    }

    /**
     * File(String parent,String child) 根据parent 路径名字符串和child 路径字符串创建一个新File 实列
     * 参数： 把路径分成两部分
     *       String parent:---父路径
     *       String child 字路径
     */
    private static void show02(String parent,String child){
       File file = new File(parent,child);
       System.out.println(file);
    }

    /**
     *  File(File parent,String child) 根据parent 路径名和child 路径字符串创建一个新File 实列
     *  参数： 把路径分成两部分
     *      *       File parent:---父路径
     *      *       String child 字路径
     *     父路径是file 类型，可以使用File 的方法对路径进行一些操作，再使用路径创建对象
     */
    private static  void show03(){
        File parent = new File("C:\\Users\\mly\\Desktop\\");
        File file = new File(parent,"hello.txt");
        System.out.println(file);
    }
}
