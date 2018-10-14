package com.sda.quiz.survey;

import com.sda.quiz.question.QuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SurveyController {
    private SurveyService surveyService;
    private QuestionService questionService;

    public SurveyController(SurveyService surveyService, QuestionService questionService) {
        this.surveyService = surveyService;
        this.questionService = questionService;
    }

    @GetMapping(path = "/surveys")
    public String findAll(Model model) {
        model.addAttribute("surveys", surveyService.findAll());
        model.addAttribute("questions", questionService.findAll());
        return "surveys";
    }
}
