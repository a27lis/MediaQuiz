package com.example.quiz.service;


import com.example.quiz.entity.Category;
import com.example.quiz.entity.Question;
import com.example.quiz.repository.QuestionRepo;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.cache.Cache;



import java.util.*;


@Service
public class QuestionService {

    private final QuestionRepo questionRepo;
    private final RestTemplate restTemplate;
    private final CacheManager cacheManager;

    public QuestionService(QuestionRepo questionRepo, RestTemplate restTemplate, CacheManager cacheManager) {
        this.questionRepo = questionRepo;
        this.restTemplate = restTemplate;
        this.cacheManager = cacheManager;
    }

    public List<Question> getRandom(Integer count) {
        if (count == null) {
            count = 1;
        }
        var questions = questionRepo.findRandom(count);
        questions.forEach(question -> cache().put(question.getId().toString(), question));
        return questions;
    }




    private Cache cache() {
        return cacheManager.getCache("questions");
    }

}
