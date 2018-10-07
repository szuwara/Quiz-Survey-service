package com.sda.quiz.answer;

import com.sda.quiz.question.Question;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "ANSWER")
@Data
@ToString(exclude = "question")
@EqualsAndHashCode(exclude = "question")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "TINYINT(1)")
    private Boolean correct;
    private String userAnswer;
    private Integer scale;

    @ManyToOne
    @JoinColumn(name = "QUESTION_ID")
    private Question question;

    public Answer() {
    }
}
