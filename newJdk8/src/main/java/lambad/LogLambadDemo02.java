package lambad;

/**
 * 使用lambad 表达式优化日志
 * 使用前提:必须存在函数接口！！！！
 */
public class LogLambadDemo02 {
    public static void show(int level,MsgFunctionLog msgFunctionLog){
        if(level==1){
            System.out.println(msgFunctionLog.msg());
        }
    }

    /**
     * 使用lambad 表达式具有延迟的加载可以避免不满足条件的运行造成内存的浪费,使用lambad 表达式的 有点和性能的提高
     * @param args
     */
    public static void main(String[] args) {
        String msg ="hello";
        String msg2 ="java";
        show(2,()->{
            System.out.println("满足条件就执行。。。");
            return msg+msg2;
        });

    }
}
