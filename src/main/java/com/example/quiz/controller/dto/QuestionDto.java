package com.example.quiz.controller.dto;

import com.example.quiz.entity.Category;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class QuestionDto {
    private Long id;
    private String question;
    private Integer difficulty;
    private Category category;
}
