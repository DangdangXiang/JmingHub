package club.jming.service;

import club.jming.enums.Status;
import club.jming.pojo.Student;

import java.util.List;

/**
 * @author 78289
 */
public interface IStudentService {
    /**
     * 返回学生信息
     * @return
     */
    List<Student> listStudents();

    Status deleteStudent(Student student);
}
