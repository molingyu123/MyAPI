package lambad;

/**
 * 函数接口：有且仅有一个抽象方法
 * 其它方法可以包含：私有，静态的等
 * @FunctionalInterface : 函数式接口的注解 使用该注解后当中只能拥有一个抽象方法
 *                      当出现两个方法后会出现编译期报错
 *                      作用:检测是否是一个函数式 接口
 *                      是：编译成功
 *                      否：编译失败
 *
 */
@FunctionalInterface
public interface FunctionDemo01 {
    // 灰色表明示可以省略的 但是建议保留便于可读
    public abstract void test();

   public static void test02(){
       System.out.println("这是个静态的方法");
   };


}
