package stream;

import java.util.ArrayList;
import java.util.List;

/**
 * java 8 特性 stream 流
 */
public class StreamDemo {
    public static void main(String[] args) {
//        method01();
        streamMethod();

    }

    /**
     * 演示普通的方式和使用stream 流式的对比
     *
     */
    private static void method01(){
        List<String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("abbb");
        list.add("ccc");
        list.add("ddd");

        List<String> list1 = new ArrayList<>();
        for(String name:list){
           if(name.startsWith("a")){
               list1.add(name);
           }
        }

        List<String> list2 = new ArrayList<>();
        for(String s:list1){
            if(s.length()>=3){
                list2.add(s);
            }
        }

        for(String s:list2){
            System.out.println(s);
        }
    }

    /**
     * 使用 jdk8 stream 流方法
     * 思想： 得益于Lambda 延迟执行特性
     *  1.建立一个生产模型线，
     *  使用一个流的三个步骤:数据源，数据转换，获取数据
     */
    private static void streamMethod(){
        List<String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("abbb");
        list.add("ccc");
        list.add("ddd");
        // 使用 函数接口的方式 加上lambamde 表达式的方式编程简化代码避免bug
        list.stream().filter(name->name.startsWith("a")).filter(name->name.length()>=3).forEach(name-> System.out.println(name));
    }
}
