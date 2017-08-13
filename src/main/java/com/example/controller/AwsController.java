package com.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.DemoApplication;
import com.example.model.Question;
import com.example.service.QuestionService;

@RestController
public class AwsController {
	
	private static final Logger logger = LoggerFactory.getLogger(AwsController.class);
	
	@Autowired
	QuestionService questionService;
	
	@RequestMapping(value = "/randomQuestion", method = RequestMethod.GET)
	public Question getRandomQuestion() {
		logger.info("randomQuestion invoked.");
		return questionService.getQuestionById(Long.valueOf("1"));
	}
	
	@RequestMapping(value = "/allquestion", method = RequestMethod.GET)
	public List<Question> getAllQuestions() {
		
		return questionService.getAllQuestions();
	}

}
