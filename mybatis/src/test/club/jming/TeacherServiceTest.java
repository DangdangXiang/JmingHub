package club.jming;

import club.jming.pojo.Teacher;
import club.jming.service.ITeacherService;
import club.jming.service.impl.TeacherServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeacherServiceTest {
    private ITeacherService service;

    @Before
    public void before(){
        service = new TeacherServiceImpl();
    }

    @Test
    public void test1(){
        List<Teacher> teachers = service.getTeachers();
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    @Test
    public void test2(){
        Map<String ,Object> map = new HashMap<>();
        map.put("name","teacher-01");
        map.put("id",1);
        System.out.println(service.getTeacher(map));
    }
}
