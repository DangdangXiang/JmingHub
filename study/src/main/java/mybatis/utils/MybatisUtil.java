package mybatis.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author 78289
 */
public class MybatisUtil {

    public static void main(String[] args) {
//        String resource = "mybatis-config.xml";
//        try {
//            InputStream is = Resources.getResourceAsStream(resource);
//            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
//            SqlSession sqlSession = sessionFactory.openSession();
//            User user = sqlSession.selectOne("User.selectUser", 1);
//            System.out.println(user);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        List<Integer> list = new ArrayList<>();

        for(int i=0;i<100;i++){
            list.add(i);
        }

        for(int i:list){
            System.out.println(i);
        }

        Stack<Integer> stack = new Stack<Integer>();
    }
}
