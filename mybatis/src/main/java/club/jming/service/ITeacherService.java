package club.jming.service;

import club.jming.pojo.Teacher;

import java.util.List;
import java.util.Map;

/**
 * @author 78289
 */
public interface ITeacherService {
    List<Teacher> getTeachers();

    Teacher getTeacher(Map<String,Object> map);
}
