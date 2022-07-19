package test;

import com.generation.service.CourseService;
import org.junit.jupiter.api.test;

import static org.junit.jupiter.api.Assertions.assertNull;


public class StudentServiceTest {
    @Test
   void checkStudentId(){
        studentService studentService= new studentService();
        assertNull(studentService.findStudent(studentid:"A123");
    }
}
