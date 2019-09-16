package anony;

/**
 * 匿名对象
 *  格式：对象名 = new 类名称();
 *  匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
 *  new 类名称（）
 *  匿名对象只能使用唯一的一次，下次再用则会再创建一个新的对象
 *  根据不同的情况使用不同的方式
 */
public class AnonyObj {
    public static void main(String[] args) {
        PersonTest personTest = new PersonTest();
        personTest.setName("dff");

        new PersonTest().setName("aaa");
        new PersonTest().getName();
    }
}
