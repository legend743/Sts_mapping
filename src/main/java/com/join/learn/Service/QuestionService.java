package com.join.learn.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.join.learn.Entity.QuestionEntity;
import com.join.learn.QuestionDAo.QuestionDao;

@Service
public class QuestionService {
	@Autowired
	private QuestionDao questionDao;

	public QuestionEntity createQuestion(QuestionEntity questionentity) {

		return questionDao.save(questionentity);
	}

}
