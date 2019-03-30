package com.example.demo8.mybatisMethod;

import java.util.List;
import java.util.Properties;

/**
 * 该接口用于创建所有需要的新对象
 * @author mly
 */
public interface ObjectFactory {
    /**
     * 设置配置信息
     * @param properties
     */
    void setProperties(Properties properties);

    /**
     * 通过无参构造创建指定类型的对象
     * @param type
     * @param <T>
     * @return
     */
    <T> T create(Class<T> type);

    /**
     * 根据参数列表，从指定类型中选择合适的构造器创建对象
     * @param type
     * @param constructorArgTypes
     * @param constructorArgs
     * @param <T>
     * @return
     */
    <T> T create(Class<T> type ,List<Class<?>> constructorArgTypes,List<Object> constructorArgs);

    /**
     * 检测指定类型是否为集合类型，主要处理java.util.Collection 及其子类
     * @param type
     * @param <T>
     * @return
     */
    <T> boolean isCollection(Class<T>type);
}
