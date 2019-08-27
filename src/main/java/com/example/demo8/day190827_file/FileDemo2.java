package com.example.demo8.day190827_file;

import java.io.File;
import java.io.IOException;

/**
 * file 创建和删除方法
 */
public class FileDemo2 {
    public static void main(String[]args) throws IOException {
//        show01();
//        show02();
        show03();
    }

    /**
     * createNewFile() ---文件不存在的时候创建文件，存在的时候返回一个false
     * 文件的注意点要看文件的类型
     */
    private static void show01() throws IOException {
        File file= new File("C:\\Users\\mly\\Desktop\\mm.txt");
        boolean b =file.createNewFile();
        System.out.println(b);

        File file2= new File("C:\\Users\\mly\\Desktop\\mm2.txt");
        boolean b2 =file.createNewFile();
        System.out.println(b2);
    }

    /**
     * 创建文件夹方法--只能创建单极文件夹---mkdir()
     *              mkdirs()-- 可以创建多级文件夹
     *              存在返回false
     *              不存在返回true
     */
    private static void show02(){
        File file = new File("aaa");
        boolean b2=file.mkdir();
        System.out.println(b2);
        File file1 = new File("aaa\\bbb\\ccc\\ddd");
        boolean b3 = file1.mkdirs();
        System.out.println(b3);
    }

    /**
     * 删除方法--文件和文件夹都可以删除
     * 返回值是布尔值
     *     true：--文件/文件删除成功，返回true
     *     false：文件夹中又内容不会删除，
     *     delete 直接走硬盘删除，不会走回收站
     */
    private static void show03(){
        File file = new File("C:\\Users\\mly\\Desktop\\mm.txt");
        boolean f=file.delete();
        System.out.println(f);

    }

}
