package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 模拟sql注入
 */
public class SQLInjection {

    public static String sql(String name){
        String sql = "select * from user where `name` = '"+name+"'";
        return sql;
    }

    public static void main(String[] args) throws Exception{
        String sql = sql("aaa' or 1=1#");
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis?useSSL=false&useUnicode=true&characterEncoding=UTF8&serverTimezone=GMT",
                "root","");
        Statement statement  = connection.createStatement();
        ResultSet set = statement.executeQuery(sql);
        while(set.next()){
            int id = set.getInt("id");
            String name = set.getString("name");
            String pwd = set.getString("pwd");
            System.out.println(id+"--"+name+"--"+pwd);
        }
    }
}
