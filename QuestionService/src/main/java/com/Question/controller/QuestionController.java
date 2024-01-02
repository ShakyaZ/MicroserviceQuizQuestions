package com.Question.controller;

import com.Question.entity.Question;
import com.Question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }


    @PostMapping
    public Question create(@RequestBody Question question){
        return questionService.create(question);

    }

    @GetMapping
    public List<Question> getAll(){
return questionService.get();
    }

    @GetMapping("/home")
    public String home(){
        return "home page";
    }

    @GetMapping("/question/questionid")
    public Question getOne(@PathVariable Long questionid){
        return questionService.getOne(questionid);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionOfQuiz(@PathVariable Long quizId){
        return questionService.getQuestionsOfQuiz(quizId);
    }
}
