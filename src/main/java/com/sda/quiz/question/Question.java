package com.sda.quiz.question;

import com.sda.quiz.answer.Answer;
import com.sda.quiz.survey.Survey;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table (name = "QUESTION")
@Data
@ToString(exclude = "surveys")
@EqualsAndHashCode(exclude = "surveys")

public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "questions")
    private Set<Survey> surveys = new HashSet<>();

    @OneToMany (mappedBy = "question", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    public List<Answer> answers = new ArrayList<>();

    public Question() {
    }
}

//TODO change templates to Thymelef
