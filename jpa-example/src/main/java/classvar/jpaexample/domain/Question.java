package classvar.jpaexample.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlSeeAlso;

@Entity
@Getter @Setter
public class Question {

    @Id @GeneratedValue
    Long id;

}
