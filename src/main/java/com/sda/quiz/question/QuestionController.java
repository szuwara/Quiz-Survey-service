package com.sda.quiz.question;

import com.sda.quiz.answer.Answer;
import com.sda.quiz.answer.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class QuestionController {
    private QuestionService questionService;
    private AnswerService answerService;
    private Question question;

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

    @GetMapping(value = "/newquestion")
    public String newQuestionSite(Model model){
        model.addAttribute("question", new Question());
        return "newquestion";
    }
    @PostMapping(path = "/newquestion")
        public String addQuestion (Question question, Answer answer){
            questionService.save(question);
            question.answers.add(answer);
            return "redirect:/";
        }
}

//TODO Freemarker template error