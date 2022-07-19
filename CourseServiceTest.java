package test;
import com.generation.service.CourseService;
import org.junit.jupiter.api.test;

import static org.junit.junit.jupiter.api.Assertions.assertEquals;

public class CourseServiceTest {
    @Test
    void courseCodeOfINTRO_CS_1(){
        courseService courseService= new CourseService();
        assertEquals(expected:"INTRO-WEB-1",courseService.getCourse(code:"INTRO-WEB-1").getcode());
    }
}
