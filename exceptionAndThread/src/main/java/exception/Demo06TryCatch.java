package exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 处理异常的第二种方式
 * try{
 *     可能产生异常的代码
 * }catch(定义一个异常的变量用来接收抛出异常的对象){
 *     异常处理逻辑,异常对象后，怎么处理对象一般在工作中记录到一个日志中
 * }
 * 如果出现多个异常可以使用多个catch
 * 当一次try catch 多个异常处理的对象的时候需要注意点
 * 如果catch 中存在子父类关系中必须将子类写在上面，否在会报错
 */
public class Demo06TryCatch {
    public static void main(String[] args) {
        String fileName ="dd";
        try {
            fileCheck(fileName);
        }catch (Exception d){
            d.printStackTrace();
        }
    }

    private static void fileCheck(String fileNmae) {
        if(!fileNmae.equals("c")){
            System.out.println("传递的文件参数不对");
        }
    }

}
