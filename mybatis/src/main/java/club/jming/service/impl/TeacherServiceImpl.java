package club.jming.service.impl;

import club.jming.dao.ITeacherMapper;
import club.jming.pojo.Teacher;
import club.jming.service.ITeacherService;
import club.jming.utils.DaoUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 78289
 */
public class TeacherServiceImpl implements ITeacherService {
    @Override
    public List<Teacher> getTeachers() {
        try (SqlSession sqlSession = DaoUtils.getSqlSession()){
            ITeacherMapper teacherMapper = sqlSession.getMapper(ITeacherMapper.class);
            List<Teacher> teachers = teacherMapper.getTeachers();
            return teachers;
        }
    }

    @Override
    public Teacher getTeacher(Map<String, Object> map) {
        try (SqlSession sqlSession = DaoUtils.getSqlSession()){
            ITeacherMapper mapper = sqlSession.getMapper(ITeacherMapper.class);
            return mapper.getTeacher(map);
        }
    }
}
