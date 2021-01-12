package club.jming.dao;

import club.jming.pojo.Teacher;

import java.util.List;
import java.util.Map;

/**
 * @author 78289
 */
public interface ITeacherMapper {
    List<Teacher> getTeachers();

    /**
     * 通过map找到合适的Teacher
     * @param map
     * @return
     */
    Teacher getTeacher(Map<String,Object> map);

}
