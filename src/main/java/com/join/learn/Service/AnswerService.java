package com.join.learn.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.join.learn.Entity.Answer;
import com.join.learn.QuestionDAo.AnswerDao;

@Service
public class AnswerService {
	@Autowired
	private AnswerDao answerdao;
	public Answer CreateAnswer(Answer answer) {
		return answerdao.save(answer);
	}

}
