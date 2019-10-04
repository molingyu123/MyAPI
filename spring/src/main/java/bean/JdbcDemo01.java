package bean;



import com.sun.tools.javac.code.Attribute;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 程序的耦合
 *  耦合：程序之间的依赖关系
 *     包括:方法之间的依赖，类之间的依赖
 *  解耦:降低程序之间的依赖关系
 *  实际开发中：应该做到编译期不依赖，运行时才依赖
 *  解耦思路:1.使用反射来创建对象，而避免使用new 关键字
 *          2.通过读取配置文件来获取创建的对象全限定类名
 */
public class JdbcDemo01 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        /**
         * jdbc的操作
         * 1.注册驱动
         * 2.获取连接
         * 3.获取操作数据的预处理的对象
         * 4.执行sql 得到结果
         * 5.遍历结果
         * 6.释放资源
         */
        //1.注册驱动
//        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        // 优化
        Class.forName("com.mysql.jdbc.Driver");
        //获取连接
        java.sql.Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","123456");
// 获取操作数据的预处理的对象
        PreparedStatement preparedStatement = connection.prepareStatement("select * from account");
        //4.执行sql 得到结果
        ResultSet resultSet = preparedStatement.executeQuery();
//        5.遍历结果
        while (resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
        //6.释放资源
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
