package com.example.demo8.recursion190828;

import java.io.File;
import java.io.FileFilter;

/**
 * FileFilter 的实现类 重写accept 方法
 */
public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if(pathname.isDirectory()){
            return  true;
        }
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
