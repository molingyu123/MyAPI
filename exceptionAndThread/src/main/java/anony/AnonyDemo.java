package anony;

import java.util.Scanner;

/**
 * 使用匿名对象作为参数的返回值
 */
public class AnonyDemo {
    public static void main(String[] args) {
        // 正常的写法
//        Scanner scanner = new Scanner(System.in);
//        String next = scanner.next();
//        System.out.println("name:"+next);

//        Scanner scanner = new Scanner(System.in);
//        method(scanner);


        Scanner scanner = returnMethod();
        String next = scanner.next();
        System.out.println("name:"+next);

    }
    // 传参
    private static void method(Scanner scanner){
        String s = scanner.next();
        System.out.println("name:"+s);
    }

    // 返回值
    private static Scanner returnMethod(){
        return new Scanner(System.in);
    }


}
