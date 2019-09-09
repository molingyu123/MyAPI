package exception;

import java.util.Objects;

/**
 * Objects 类中静态方法
 */
public class Demo04Objects {
    public static void main(String[] args) {

    }
    public static void method(Object obj){
        //对传递过来的参数进行合法性判断，判断是否为null
//        if(obj==null){
//            throw  new NullPointerException("参数不合法");
//        }
        // 使用Objects 中的方法简化上面的校验--可以用于判断是否为空的校验
        Objects.requireNonNull(obj,"参数不合法");
    }
}
