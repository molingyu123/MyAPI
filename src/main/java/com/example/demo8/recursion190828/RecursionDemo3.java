package com.example.demo8.recursion190828;

/**
 * 使用递归求阶乘
 *
 */
public class RecursionDemo3 {
  public static void main(String []args){
      int s=getSum(8);
      System.out.println(s);
  }

  public static int getSum(int n){
      // 结束条件
      if(n==1){
          return 1;
      }
      return n*getSum(n-1);
  }
}
