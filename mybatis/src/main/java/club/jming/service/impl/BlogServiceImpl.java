package club.jming.service.impl;

import club.jming.dao.IBlogMapper;
import club.jming.pojo.Blog;
import club.jming.service.IBlogService;
import club.jming.utils.DaoUtils;
import org.apache.ibatis.session.SqlSession;

public class BlogServiceImpl implements IBlogService {
    @Override
    public void insertBlog(Blog blog) {
        try (SqlSession sqlSession = DaoUtils.getSqlSession()){
            IBlogMapper mapper = sqlSession.getMapper(IBlogMapper.class);
            mapper.insertBlog(blog);
            sqlSession.commit();
        }
    }

    @Override
    public Blog findBlog(String author, String title) {
        try (SqlSession sqlSession = DaoUtils.getSqlSession()){
            IBlogMapper mapper = sqlSession.getMapper(IBlogMapper.class);
            return mapper.findBlog(author,title);
        }
    }
}
