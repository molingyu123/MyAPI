package factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 创建bean 对象
 * bean:再计算机英语中，有可重用组件的含义
 * javaBean： 用java 语言编写的可重用组件
 *    javaBean != 实体类
 *
 *    它就是创建我们的service 和 dao 对象
 *    第一个：需要一个配置文件类配置我们的service 和 dao
 *            配置的内容：唯一标识=全限定类名（key =value)
 *    第二个：通过读取配置文件中的配置的内容,反射创建对象
 *
 *    配置文件可以是xml 和 properties
 *
 */
public class BeanFactory {
        // 定义properties 对象 来实现读取配置文件
        private static Properties properties;

        // 定义一个map 用于存放我们要创建的对象，我们把它称之为容器
        private static Map<String,Object> beans;

        static {
            try {
            // 实列化对象
                 properties= new Properties();
                InputStream inputStream= BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
                properties.load(inputStream);
                // 实例化
                beans = new HashMap<String,Object>();
                // 取出配置文件中所有的key
                Enumeration keys = properties.keys();
                while (keys.hasMoreElements()){
                    String key = keys.nextElement().toString();
                    String beanPath = properties.getProperty(key);
                    // 反射创建对象
                    Object value = null;
                    try {
                        value = Class.forName(beanPath).newInstance();
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    beans.put(key,value);
                }
            } catch (IOException e) {
                throw new ExceptionInInitializerError("初始化失败");
            }
        }

    /**
     * 根据bean 的名称获取bean 对象
     * @param beanName
     * @return
     */
    public static Object getBean(String beanName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
            Object bean =null;
            String beanPath = properties.getProperty(beanName);
            System.out.println(beanPath);
            // 使用反射的方式获取对象
            bean=Class.forName(beanPath).newInstance();
            return bean;
        // 改造上面的代码，变为一个单例的对象
//        return  beans.get(beanName);
        }

}
