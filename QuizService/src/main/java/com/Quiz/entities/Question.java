package com.Quiz.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Question {

    private Long id;
    private String question;
    private Long quizId;

//    public Question(Long id, String question, Long quizId) {
//        this.id = id;
//        this.question = question;
//    }
//
//    public Question() {
//
//    }
}

