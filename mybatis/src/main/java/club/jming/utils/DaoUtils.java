package club.jming.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 78289
 */
public class DaoUtils {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            String mybatisConfig = "mybatis-config.xml";
            InputStream is = Resources.getResourceAsStream(mybatisConfig);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
