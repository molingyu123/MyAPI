package exception;

/**
 * throw 关键字
 *   作用：可以使用throw 关键字在指定的方法中抛出指定的异常
 *   throw 关键字必须写在方法的内部
 *   throw 关键字后边new 的对象必须是Exception 或者Exception 的子类对象
 *   throw 关键字后边创建的是RuntimeException 或者是RuntimeException 子类对象我们可以不处理，默认
 *          交给jvm 处理（打印异常对象，中断程序)
 *   throw 关键字后边创建的是编译异常(写代码的时候报错),我们就必须处理这个异常，要么throws 要么
 *         try{}catch
 */
public class ExceptionDemo03 {
    public static void main(String[] args) {
        int [] arr={1,2};
        int e =getElement(arr,2);
        System.out.println(e);

    }

    /**
     * 调用方法必须对方法进行合法性的校验
     *  校验的方式就是在方法中对传过来的参数做校验
     * @param arr
     * @param index
     * @return
     */
    public static int getElement(int [] arr,int index){
        /**
         * 如果arr 数组为空则告诉用户传递过来的值是空
         */
        if(arr==null){
            throw new NullPointerException("传递的值是空");
        }
        if(index<0 || index>arr.length){
            throw  new ArrayIndexOutOfBoundsException("传递数组索引越界了");
        }
        int ele = arr[index];
        return  ele;
    }

}
