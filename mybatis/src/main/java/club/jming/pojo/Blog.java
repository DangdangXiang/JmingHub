package club.jming.pojo;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 博客实体类
 *
 * @author 78289
 */
@Data
public class Blog implements Serializable {
    private String id;
    private String title;
    private String author;
    private Date createTime;
    @SuppressWarnings("all")
    private int views;
}
