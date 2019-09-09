package exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * java.lang.Throwable 是所有异常的超类
 *    Exception:编译期异常--写代码的时候发生的错误
 *        RunTimeException:运行期异常--java 程序运行的过程这个异常属于小毛病
 *    Error:程序运行过程出现的错误--必须通过修改源代码，程序才能继续运行
 *
 */
public class ExceptionDemo01 {
    public static void main(String[] args) throws ParseException {
        // Exception 演示
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 把字符串的日期格式解析成日期格式
        sdf.parse("1999-01-01");
    }
}
