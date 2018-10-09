package com.sda.quiz.question;

import com.sda.quiz.answer.Answer;
import com.sda.quiz.answer.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {
    private QuestionRepository questionRepository;
    private AnswerRepository answerRepository;

    @Autowired
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Autowired
    public List<Question> findAll(){
        return questionRepository.findAll();
    }

    public Question save (Question question){
        return questionRepository.save(question);
    }

}
