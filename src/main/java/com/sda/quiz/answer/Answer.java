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
    private Long id;
    @Column(columnDefinition = "TINYINT(1)")
    private Boolean correct;
    @Column(name = "USER_ANSWER")
    private String userAnswer;
    private Integer scale;

    @ManyToOne
    @JoinColumn(name = "QUESTION_ID")
    private Question question;

    public Answer() {
    }
}
