package club.jming.service;

import club.jming.pojo.Blog;

/**
 * @author 78289
 */
public interface IBlogService {
    void insertBlog(Blog blog);

    Blog findBlog(String author,String title);
}
