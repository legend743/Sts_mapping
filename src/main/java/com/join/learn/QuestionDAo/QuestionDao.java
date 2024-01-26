package com.join.learn.QuestionDAo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.join.learn.Entity.QuestionEntity;

public interface QuestionDao extends JpaRepository<QuestionEntity, Integer> {

}
