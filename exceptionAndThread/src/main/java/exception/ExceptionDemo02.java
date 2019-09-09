package exception;

/**
 * 异常产生过程的分析
 */
public class ExceptionDemo02 {
    public static void main(String[] args){
        int [] arr ={1,2,3};
        int e =getElement(arr,3);
        System.out.println(e);
    }

    public static int getElement(int [] arr,int index){
        int ele = arr[index];
        return  ele;
    }

}
