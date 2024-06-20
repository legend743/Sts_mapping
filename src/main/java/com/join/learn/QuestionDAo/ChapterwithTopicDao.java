package com.join.learn.QuestionDAo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.join.learn.Entity.ChapterWiseNotes;
import com.join.learn.Entity.Topic;

public interface ChapterwithTopicDao extends JpaRepository<ChapterWiseNotes, Integer>{


void save(Topic topic);
}
