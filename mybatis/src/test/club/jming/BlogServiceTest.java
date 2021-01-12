package club.jming;

import club.jming.pojo.Blog;
import club.jming.service.IBlogService;
import club.jming.service.impl.BlogServiceImpl;
import club.jming.utils.GenerateUtils;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogServiceTest {
    private IBlogService service;
    @Before
    public void before(){
        service = new BlogServiceImpl();
    }

    @Test
    public void test01(){
        List<Blog> blogs = new ArrayList<>();
        for (int i=0;i<10;i++){
            Blog blog = new Blog();
            blog.setId(GenerateUtils.getUUID());
            blog.setAuthor("author-"+i);
            blog.setCreateTime(new Date());
            blog.setTitle("title-"+i);
            blogs.add(blog);
        }
        for (Blog blog : blogs) {
            service.insertBlog(blog);
        }
    }

    @Test
    public void test02(){
        String author = "author-0";
        String title = null;
        System.out.println(service.findBlog(author,null));
        System.out.println(service.findBlog(author,null));
    }
}
