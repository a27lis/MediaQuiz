package com.example.quiz.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String question;

    @JsonIgnore
    @Column(nullable = false)
    private String answer;

    @ManyToOne
    @JoinColumn
    private Category category;

    @Column(nullable = false)
    private Integer difficulty;

}
