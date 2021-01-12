package club.jming.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author 78289
 */
@Data
public class Teacher {
    private int id;
    private String name;
    private List<Student> students;
}
