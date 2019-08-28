package com.example.demo8.recursion190828;

/**
 * 使用递归计算 1到 n 的和
 */
public class RecursionDemo2 {
    public static void main(String []args){
        /**
         * 由主方法进入栈内存--调用sum 方法
         * sum 方法会一直的调用sum 方法
         * 当等于到一的时候会带着结果一个一个的返回
         * 返回一个栈内存清除一个，当最后打印出来后将栈内存中的方法清除
         *
         * 但注意：不建议使用递归的方法，效率低
         */
        int s= sum(100);
        System.out.println(s);
    }
    /**
     *
     * 使用递归的目的：获取下一个被加的数字(n-1)
     * 递归的结束条件：获取到1的时候结束
     */
    public static int sum(int n){
        //结束的条件
        if(n==1){
            return  1;
        }
        // 获取下一个被加数字
        return n+sum(n-1);// 调用自己的方法
    };


}
