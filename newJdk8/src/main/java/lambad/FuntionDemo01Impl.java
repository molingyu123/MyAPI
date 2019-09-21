package lambad;

/**
 *  @Override:
 *     注解 检查方法是否为重写的方法
 *      是：编译成功
 *      否：编译失败
 */
public class FuntionDemo01Impl implements FunctionDemo01 {
    @Override
    public void test() {
        System.out.println("我是实现函数接口的实现类。。。");
    }

}
