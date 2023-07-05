package com.example.quiz.repository;

import com.example.quiz.entity.Question;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface QuestionRepo extends PagingAndSortingRepository<Question, Long> {
    @Query(nativeQuery = true, value = "SELECT *  FROM question ORDER BY random() LIMIT :count")
    List<Question> findRandom(Integer count);
}
