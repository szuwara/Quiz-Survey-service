package com.sda.quiz.survey;

import com.sda.quiz.question.Question;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "SURVEY")
@Data //all getters, setters etc (from lombok)
@ToString(exclude = "questions")
@EqualsAndHashCode(exclude = "questions")
public class Survey {
    @Id
    private long id;
    private String title;
    private String description;
    private Date creationDate;
    private Date expirationDate;
    private String link;

    @ManyToMany
    @JoinTable(
            name = "QUESTION_SURVEY",
            joinColumns = {@JoinColumn(name = "SURVEY_ID")},
            inverseJoinColumns = {@JoinColumn(name = "QUESTION_ID")}

    )

    private Set<Question> questions = new HashSet<>();

    public Survey() {
    }
}
