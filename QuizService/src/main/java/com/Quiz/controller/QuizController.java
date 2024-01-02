package com.Quiz.controller;

import com.Quiz.entities.Quiz;
import com.Quiz.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")

public class QuizController {

    @Autowired
    private QuizService quizService;

    public QuizController(QuizService quizService){
        this.quizService =  quizService;

    }
    //create
    @PostMapping
    public Quiz create(@RequestBody Quiz quiz){
        return  quizService.add(quiz);
    }

    //get all
    @GetMapping
    public List<Quiz> get(){
        return quizService.get();
    }
    @GetMapping("/quiz/{id}")
    public Quiz getOne(@PathVariable Long id ){
        return quizService.get(id);
    }



}
