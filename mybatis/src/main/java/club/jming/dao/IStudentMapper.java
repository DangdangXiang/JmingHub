package club.jming.dao;

import club.jming.enums.Status;
import club.jming.pojo.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 78289
 */
public interface IStudentMapper {

    /**
     * 返回所有学生信息
     * @return
     */
    List<Student> listStudents();

    /**
     * 删除一个匹配的学生信息
     * @param student
     */
    @Delete("delete from `student` where `id` = #{id} and `name` = #{name}")
    void deleteStudent(Student student);

    /**
     * 查找学生是否存在
     * @param student
     * @return
     */
    @Select("select count(*) from student where `id` = #{id} and `name` = #{name}")
    int findStudent(Student student);
}
