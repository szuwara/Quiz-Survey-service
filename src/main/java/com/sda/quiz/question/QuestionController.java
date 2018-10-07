package com.sda.quiz.question;

import com.sda.quiz.answer.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuestionController {
    private QuestionService questionService;
    private AnswerService answerService;

    @Autowired
    public QuestionController(QuestionService questionService, AnswerService answerService) {
        this.questionService = questionService;
        this.answerService = answerService;
    }

    @GetMapping(value = "/questions")
    public String findAll(Model model){
        model.addAttribute("questions", questionService.findAll());
        return "questions";
    }
}
