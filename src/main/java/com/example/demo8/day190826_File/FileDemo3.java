package com.example.demo8.day190826_File;

import java.io.File;

/**
 * file 类获取功能的方法
 *    public String getAbsolutePath() :返回此file 绝对路径
 *    public String getPath() ---将此file 转换为路径名字符串
 *    public String getName() --- 返回此File 表示的文件或目录的名称
 *    public long length() -- 返回由此file 表示的文件长度
 */
public class FileDemo3 {
    public static void main(String[] args){
        show01();
    }

    /**
     * public String getAbsolutePath() :返回此file 绝对路径
     * @return
     */
    private static void show01(){
         File file = new File("C:\\Users\\mly\\Desktop\\map.txt");
         String s1= file.getAbsolutePath();
         System.out.println(s1);

        File file1 = new File("map.txt");// 返回当前项目下路径名称
        String s2= file1.getAbsolutePath();
        System.out.println(s2);

        File file2 = new File("C:\\Users\\mly\\Desktop\\map.txt");
        String s3= file2.getPath();
        System.out.println(s1);


        File file3 = new File("map.txt");
        String s4= file3.getPath();
        System.out.println(s4);

        File file4 = new File("map.txt");
        String name =file4.getName();
        System.out.println(name);



    }


}
