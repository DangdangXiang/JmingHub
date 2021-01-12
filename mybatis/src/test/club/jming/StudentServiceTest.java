package club.jming;

import club.jming.pojo.Student;
import club.jming.service.IStudentService;
import club.jming.service.impl.StudentServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.UUID;

public class StudentServiceTest {
    private IStudentService service;

    @Before
    public void before(){
        service = new StudentServiceImpl();
    }

    @Test
    public void test01(){
        List<Student> students = service.listStudents();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void test02(){
        Student student = new Student();
        student.setId(1);
        student.setName("student-01");
        System.out.println(service.deleteStudent(student));
    }

    @Test
    public void test3(){
        for (int i=0;i<10;i++){
            System.out.println(UUID.randomUUID().toString().replace("-",""));
        }
    }
}
