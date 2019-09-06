package com.example.demo8.propertis;


import java.util.Properties;
import java.util.Set;

/**
 * java.util.Properties 集合继承了Hashtable<key,value> implements Map<key,value>
 *     属于双列集合--是唯一个和IO 流相结合的集合
 *     key ,value --默认是字符串
 */
public class PropertiesDemo {
    public static void main(String[] args) {
        Properties properties = new Properties();
        // 添加
        properties.setProperty("a","124");
        properties.setProperty("b","1222");
        properties.setProperty("c","234");
        // 获取当前集合中元素
       Set<String> strings= properties.stringPropertyNames();
       for(String key:strings){
           System.out.println(properties.getProperty(key));
       }
    }


}
