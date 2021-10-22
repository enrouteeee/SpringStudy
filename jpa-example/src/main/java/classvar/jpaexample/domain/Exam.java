package classvar.jpaexample.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Exam {

    @Id @GeneratedValue
    Long id;

    String name;

    //일대다 단방향

    //다대일 양방향
    @ManyToOne @JoinColumn(name = "course_id")
    Exam exam;
}
