package com.sda.quiz.question;

import com.sda.quiz.answer.Answer;
import com.sda.quiz.survey.Survey;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name = "QUESTION")
@Data
@ToString(exclude = "surveys")
@EqualsAndHashCode(exclude = "surveys")

public class Question {
    @Id
    private long id;
    private String description;

    @ManyToMany(mappedBy = "questions")
    private Set<Survey> surveys = new HashSet<>();

    @OneToMany (mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Answer> answers = new HashSet<>();


    public Question() {
    }
}
