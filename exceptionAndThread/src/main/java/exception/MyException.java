package exception;

/**
 * 自定义异常：
 * 格式：public class xxx extends Exception  \ RuntimeException
 * 编译期的异常必须处理要么交给JVM要么try{}catch{}
 * 运行期的异常可以不用处理
 */
public class MyException extends Exception{
    public  MyException(){}

    public MyException(String message){
        super(message);//调用父类的构造方法
    }

}
