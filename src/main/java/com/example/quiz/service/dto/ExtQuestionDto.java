package com.example.quiz.service.dto;

import lombok.Data;

@Data
public class ExtQuestionDto {
    private Long id;
    private String question;
    private String answer;
    private ExtCategoryDto category;
    private Integer difficulty;
}
