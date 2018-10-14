package com.sda.quiz.question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.HashMap;
import java.util.Map;

@Controller
public class QuestionController {
    private QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping(value = "/questions")
    public String findAll(Model model) {
        model.addAttribute("questions", questionService.findAll());
        return "questions";
    }

    @GetMapping(value = "/newquestion")
    public String newQuestionSite(Model model) {
        model.addAttribute("question", new Question());
        return "question-new";
    }

    @RequestMapping(value = "/newquestion", method = RequestMethod.POST)
    public String addQuestion(Question question) {
        question.getAnswers().forEach(answer -> answer.setQuestion(question));
        questionService.save(question);
        return "redirect:/questions";
    }

    @GetMapping(path = "/questions/update/{id}" )
    public ModelAndView updateSite(@PathVariable(name = "id")Long id){
        Question question = questionService.findById(id).orElseThrow(()->new RuntimeException("Question not found with ID: "+ id));
        Map<String, Object> params = new HashMap<>();
        params.put("question", question);
        return new ModelAndView("question-update", params);
    }
    @PostMapping(path = "/questions/update")
    public String doUpdate(Question question){
        question.getAnswers().forEach(answer -> answer.setQuestion(question));
        questionService.save(question);
        return "redirect:/questions";
    }

    @GetMapping(value = "/questions/delete/{id}")
    public String deleteQuestion(@PathVariable Long id, Question question){
        questionService.findById(id);
        questionService.delete(question);
        return "redirect:/questions";
    }
}