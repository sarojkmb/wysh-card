package com.abrolly.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abrolly.model.Question;
import com.abrolly.repository.QuestionRepository;
import com.abrolly.service.QuestionService;

@Service("questionService")
public class QuestionServiceImpl implements QuestionService{
	
	@Autowired
	QuestionRepository questionRepository;

	@Override
	public Question getRandomQuestionService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAnswerService(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Question> getAllQuestions() {
		return questionRepository.findAll();
	}

	@Override
	public Question getQuestionById(Long id) {
		return questionRepository.findOne(id);
	}

}
