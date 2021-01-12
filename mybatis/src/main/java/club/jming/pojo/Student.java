package club.jming.pojo;

import lombok.Data;

/**
 * @author 78289
 */
@Data
public class Student {
    private int id;
    private String name;
    private Teacher teacher;
}
