package com.join.learn.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="QuestionsTable")
public class QuestionEntity {
	@Column(name="Question")
	private String Question;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne
	private Answer answer;
	
	
	
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	public QuestionEntity(String question, int id, Answer answer) {
		super();
		Question = question;
		this.id = id;
		this.answer = answer;
	}
	public QuestionEntity() {
		super();
		
	}
	
	

}
