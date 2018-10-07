package com.sda.quiz.answer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnswerController {
    private AnswerService answerService;

    public AnswerController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @GetMapping(value = "/answers")
    public String findAll(Model model){
        model.addAttribute("answers", answerService.findAll());
        return "answers";
    }
}
