package com.Quiz.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor

public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    transient private List<Question>  questions;

    public Quiz(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Quiz() {

    }
}
