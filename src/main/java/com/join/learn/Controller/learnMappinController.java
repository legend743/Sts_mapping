package com.join.learn.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.join.learn.Entity.QuestionEntity;
import com.join.learn.Service.QuestionService;

@RestController

public class learnMappinController {
	@Autowired
	private QuestionService questionService; 
@PostMapping("/Question")
private ResponseEntity<QuestionEntity> Question(@RequestBody QuestionEntity questionentity){
	QuestionEntity createquestion=questionService.createQuestion(questionentity);
	
	return new ResponseEntity<>(createquestion,HttpStatus.CREATED);
	
}
}
