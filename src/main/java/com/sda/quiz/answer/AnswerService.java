package com.sda.quiz.answer;

import com.sda.quiz.question.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnswerService {
    private AnswerRepository answerRepository;

    @Autowired
    public AnswerService(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    @Autowired
    public List<Answer> findAll(){
        return answerRepository.findAll();
    }
    public Optional<Answer> findAllByQuestionId(Long id){
        return answerRepository.findById(id);
    }
}
