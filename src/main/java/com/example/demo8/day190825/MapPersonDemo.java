package com.example.demo8.day190825;

import java.util.HashMap;

/**
 * 自定义类型map 测试
 */
public class MapPersonDemo {

    private HashMap<Person,String> eStringHashMap;

    public static void main(String[] args){
        MapPersonDemo mapPersonDemo = new MapPersonDemo();
        mapPersonDemo.mapPersonKey();
    }

    /**
     *  添加到集合中
     */
    private void mapPersonKey(){
        eStringHashMap = new HashMap<>();
        eStringHashMap.put(new Person("aaa",22),"Java全栈班");
        eStringHashMap.put(new Person("bbb",23),"python全栈班");
        eStringHashMap.put(new Person("ccc",24),"C++全栈班");
        System.out.println("输出当前的集合："+eStringHashMap);
        System.out.println("-----------------");
    }


}
