package com.example.quiz.repository;

import com.example.quiz.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category, Long> {
}
