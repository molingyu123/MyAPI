package lambad;

/**
 * 函数接口使用
 */
public class DoFunctionDemo01 {
    // 定义一个方法调用传入函数接口的作为参数，调用抽象方法
    public static  void show(FunctionDemo01 functionDemo01){
        functionDemo01.test();
    }

    public static void main(String[] args) {
        // 测试，可以奖接口的实现类对象传入作为参数代替接口的参数对象
//        show(new FuntionDemo01Impl());

        show(new FunctionDemo01() {
            @Override
            public void test() {
                System.out.println("使用匿名内部类重写接口的抽象方法");
            }
        });

        // 如果传入的参数是一个函数接口对象，可以使用Lambad 表达式的方式编写
        show(()->{
            System.out.println("使用Lambad 表达式的方法重写接口抽象方法");
        });

        // 简化lambad 表达式编写方式
        show(()-> System.out.println("简化Lambad 表达式的方法重写接口抽象方法。。。。。"));


    }
}
