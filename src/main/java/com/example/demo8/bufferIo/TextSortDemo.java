package com.example.demo8.bufferIo;

import java.io.*;
import java.util.HashMap;

/**
 * 文本排序练习
 */
public class TextSortDemo {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> hashMap = new HashMap<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("io.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("io2.txt"));
        String line;
        while ((line=bufferedReader.readLine())!=null){
            // 切割以点为标准 点属于特殊符号 需要通过斜杠转换字符
            String [] arr=line.split("\\.");
            hashMap.put(arr[0],arr[1]);
        }
        for(String key:hashMap.keySet()){
            String value = hashMap.get(key);
            line=key+"."+value;
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        bufferedReader.close();
    }
}
