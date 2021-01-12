package club.jming.dao;

import club.jming.pojo.Blog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * @author 78289
 */
public interface IBlogMapper {

    void insertBlog(Blog blog);

    Blog findBlog(@Param("author") String author, @Param("title") String title);
}
