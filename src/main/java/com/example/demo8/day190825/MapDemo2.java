package com.example.demo8.day190825;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 演示map 遍历的方法
 * @author mly
 */
public class MapDemo2 {

    public static void main(String[] args){
        HashMap<String,Integer> stringIntegerHashMap=new HashMap<>();
        stringIntegerHashMap.put("aaa",122);
        stringIntegerHashMap.put("bbb",1233);
        stringIntegerHashMap.put("ccc",5455);
        stringIntegerHashMap.put("ddd",1333);
        stringIntegerHashMap.put("eee",234);
        //遍历集合中所有的key
        System.out.println("集合中所有的键:");
        // 获取集合中所有的key
        Set<String> strings = stringIntegerHashMap.keySet();
        for(String s:strings){
            System.out.println("输出key:"+s);
        }

        // 遍历集合中所有的value
        Collection<Integer> collection=stringIntegerHashMap.values();
        for(Integer i:collection){
            System.out.println("集合中所有的value:"+i);
        }

        // 遍历集合中所有的键值对
        System.out.println("键值对:");
        Set<Map.Entry<String, Integer>> maps=stringIntegerHashMap.entrySet();
        for(Map.Entry<String,Integer> entry:maps){
            System.out.println("键值对:"+entry);
        }


    }




}
