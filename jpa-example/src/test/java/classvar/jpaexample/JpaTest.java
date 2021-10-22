package classvar.jpaexample;

import classvar.jpaexample.domain.Course;
import classvar.jpaexample.domain.Exam;
import org.aspectj.lang.annotation.RequiredTypes;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Transactional
@SpringBootTest
public class JpaTest {

    @PersistenceContext
    private EntityManager em;

    @Test
    void test1() throws Exception{
        Exam exam = new Exam();
        exam.setName("exam1");
        em.persist(exam);

        Course course = new Course();
        course.setName("course1");
        course.getExams().add(exam);
        em.persist(course);


        em.flush();
    }
}
