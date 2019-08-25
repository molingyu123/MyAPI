package com.example.demo8.day190825;

import com.alibaba.druid.sql.visitor.functions.Char;

import java.util.HashMap;
import java.util.Scanner;

/**
 *练习
 *  让用户输入一个字符，判断当前的字符是否存在集合中，如果存在则
 *  输出当前key 所有对应的value 值
 *  如果不存在就添加到集合中，并告诉用户当前key 不在集合中并添加到集合中
 */
public class explainString {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符：");
        String inputStr = scanner.next();
        char[] chars = inputStr.toCharArray();
        HashMap<Character,Integer> characterIntegerHashMap = new HashMap<>();
        for(int i=0;i<chars.length;i++){
            char key = chars[i];
            boolean keyIsNo=characterIntegerHashMap.containsKey(key);
            if(keyIsNo==true){
                Integer integer = characterIntegerHashMap.get(key);
                System.out.println("集合中的值："+integer);
            }else{
                System.out.println("集合中没有这个值："+key);
                characterIntegerHashMap.put(key,1);
            }
        }
    }
}
