package com.example.demo8.day190825_Thread;

/**
 * 抛出异常的演示
 */
public class Demo2 {

    public static void main(String [] args){
        int [] arr = new int[3];
        getElement(arr,3);
        System.out.println("---------------------");
        getElement(null,3);
    }


    public static int getElement(int[] arr,int i){
        // 合法校验
           // 1.数组不能为空
        if(arr==null){
            System.out.println("不能为空");
            throw new NullPointerException("传递的数组值是null");
        }
        // 2.索引不能超过数组范围
        if(i<0 || i>arr.length-1){
            System.out.println("索引越界了");
            throw  new ArrayIndexOutOfBoundsException("传递的索引超过了数组的范围");
        }
        // 正常情况
        int num =arr[i];
        return num;
    }


}
