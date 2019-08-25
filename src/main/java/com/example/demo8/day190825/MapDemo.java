package com.example.demo8.day190825;

import java.util.HashMap;

/**
 * Map ---crud
 *
 *map 集合：
 *   1.存储的是兼职对
 *   2.key 是不允许重复的
 *   3.hashMap 是无序的集合
 *   4.LinkedHashMap 是有序的集合
 */
public class MapDemo {

    private HashMap<String,String> stringStringHashMap;

    public static void main(String [] args){
        /**
         * 如果添加发现key 重复则会将集合中已存在的key 的value 值覆盖掉
         */
        MapDemo mapDemo = new MapDemo();
        mapDemo.mapAdd();
        /**
         * 根据key 名称进行删除
          */
        mapDemo.removeMap();

        /**
         * 获取指定key--返回当前的key 所对应的value 值
         */
        mapDemo.getMap();

        /**
         * 判断指定的key 是否在集合中，
         * 在----返回true
         * 不在---返回false;
         */
        mapDemo.mapContains();



    }

    /**
     * hashMap添加--元素
     *
     */
    private void mapAdd(){
        stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("aaa","1232");
        stringStringHashMap.put("bbb","234");
        stringStringHashMap.put("aaa","234");
        System.out.println("添加成功：。。。。。");
        System.out.println(stringStringHashMap);
    }

    /**
     * 删除元素
     */
    private  void removeMap(){
         stringStringHashMap.remove("aaa");
         System.out.println("删除成功:........");
         System.out.println(stringStringHashMap);
    }

    /**
     * 获取指定的元素
     */
    private void getMap(){
        String getKey =stringStringHashMap.get("bbb");
        System.out.println("获取到元素的值:"+getKey);

    }

    private void mapContains(){
      boolean key = stringStringHashMap.containsKey("aaa");
      System.out.println("判断当前的容器是否包含："+key);
    }

}
