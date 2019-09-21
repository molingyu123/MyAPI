package lambad;

/**
 * 日志性能演示
 */
public class LogDemo01 {
    // 更据日志的级别显示提示的信息的方法
    public static void showLog(int level,String msg){
        if(level==1){
            System.out.println(msg+"级别的日志");
        }
    }

    public static void main(String[] args) {
        String msg ="hello";
        String msg2 ="java";
        String msg3=msg+msg2;
        showLog(2,msg3);
    }

}
