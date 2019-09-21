package lambad;

/**
 * 使用lambad 表达式方法创建一个线程
 * 使用lambad 传递参数
 */
public class LambadDmeo02 {
    public static void main(String[] args) {
        // 重写方法体--匿名内部类
       startThread(new Runnable() {
           @Override
           public void run() {
               System.out.println(Thread.currentThread().getName()+"...线程启动了");
           }
       });
       // 因为方法的参数式一个函数式接口，使用lambad 表达式传递
        startThread(()->{
            System.out.println(Thread.currentThread().getName()+"lambad 线程启动了");
        });

        // 优化上面表达式
        startThread(()-> System.out.println(Thread.currentThread()+"优化后的线程启动了"));

    }

    private static void startThread(Runnable runnable){
        new Thread(runnable).start();
    }
}
