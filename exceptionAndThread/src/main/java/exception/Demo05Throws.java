package exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * throws 关键字是异常处理的一种方式交给别人处理
 *   throws 关键字必须写在方法声明处
 *          后边声明的异常必须是Exception 或者是Exception子类
 *          方法内部如果抛出了多个异常对象，那么Throws 后边必须也声明多个异常如果抛出的多个异常
 *          对象有子父类关系，那么直接声明父类异常即可
 *   编译期：的异常必须去处理使用try{}catch或者抛出
 */
public class Demo05Throws {
    public static void main(String[] args) throws IOException {
        String fileName ="d.tx";
        fileCheck(fileName);

    }

    /**
     * 由于抛出的两个异常存在父子类关系，这里只要抛出IoException
     * @param fileNmae
     * @throws IOException
     */
    private static void fileCheck(String fileNmae) throws IOException {
        if(!fileNmae.equals("c")){
            throw new FileNotFoundException("传递的文件参数不对");
        }
        if(fileNmae.endsWith(".txt")){
            throw new IOException("文件格式不对");
        }
    }

}
