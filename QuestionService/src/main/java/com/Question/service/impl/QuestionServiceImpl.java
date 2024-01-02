package com.Question.service.impl;

import com.Question.entity.Question;
import com.Question.repository.QuestionRepository;
import com.Question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;
    @Override
    public Question create(Question question) {
        return questionRepository.save(question);
    }
    @Override
    public List<Question> get() {
        return questionRepository.findAll();
    }
    @Override
    public Question getOne(Long id) {
        return questionRepository.findById(id).orElseThrow(() ->new RuntimeException("question not found!"));
    }

    @Override
    public List<Question> getQuestionsOfQuiz(Long quizId) {
        return questionRepository.findByQuizId(quizId);
    }
}
