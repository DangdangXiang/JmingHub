package club.jming.service.impl;

import club.jming.dao.IStudentMapper;
import club.jming.enums.Status;
import club.jming.pojo.Student;
import club.jming.service.IStudentService;
import club.jming.utils.DaoUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author 78289
 */
public class StudentServiceImpl implements IStudentService {
    @Override
    public List<Student> listStudents() {
        try(SqlSession sqlSession = DaoUtils.getSqlSession()){
            IStudentMapper studentMapper = sqlSession.getMapper(IStudentMapper.class);
            List<Student> students = studentMapper.listStudents();
            return students;
        }
    }

    @Override
    public Status deleteStudent(Student student) {
        try (SqlSession sqlSession = DaoUtils.getSqlSession()){
            IStudentMapper mapper = sqlSession.getMapper(IStudentMapper.class);
            if (mapper.findStudent(student) > 0){
                mapper.deleteStudent(student);
                return Status.Success;
            }else {
                return Status.Error;
            }
        }
    }
}
