package factory;

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

}
