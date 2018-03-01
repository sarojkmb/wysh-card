package com.abrolly.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abrolly.model.Question;


@Repository("questionRepository")
public interface QuestionRepository extends JpaRepository<Question, Long> {
	
	List<Question> findByCategory(String category);
}
