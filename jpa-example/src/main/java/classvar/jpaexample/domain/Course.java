package classvar.jpaexample.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Course {

    @Id
    @GeneratedValue
    @Column(name = "course_id")
    Long id;

    String name;

    //일대다 단방향
//    @OneToMany @JoinColumn(name = "course_id")
//    List<Exam> exams = new ArrayList<>();

    //다대일 양방향
    @OneToMany(mappedBy = "course")
    List<Exam> exams = new ArrayList<>();
}
