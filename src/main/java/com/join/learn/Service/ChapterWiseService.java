package com.join.learn.Service;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.join.learn.Entity.ChapterWiseNotes;
import com.join.learn.Entity.Topic;
import com.join.learn.QuestionDAo.ChapterwithTopicDao;
import com.join.learn.QuestionDTO.ChapterwithTopicDTO;
@Service
public class ChapterWiseService {
	@Autowired
	
	private ChapterwithTopicDao chapterdao;
	
	public String addChapterToic(ChapterwithTopicDTO chapterDto) {
		  try {
	            // Extract data from the DTO
	            int chapterNumber = chapterDto.getChapter();
	            System.out.println(chapterNumber);
	            int unitNumber = chapterDto.getUnit();
	            System.out.println(unitNumber);
	            String unitName = chapterDto.getUnitName();
	            System.out.println(unitName);

	            // Create and save Chapter entity
	            ChapterWiseNotes chapter = new ChapterWiseNotes();
	            chapter.setChapterNumber(chapterNumber);
	            // Set any other properties of the chapter
	            chapterdao.save(chapter);

	            // Create and save Topic entity
	            Topic topic = new Topic();
	            topic.setUnit(unitNumber);
	            topic.setUnitName(unitName);
	            // Set any other properties of the topic
	            chapterdao.save(topic);
	            return "succesfull";
	            
	            // You can associate the chapter and topic if necessary

	        } catch (Exception e) {
	            // Handle any exceptions
	            e.printStackTrace(); // Log the exception for debugging
	            throw new ServiceException("Failed to add chapter with topic");
	        }
	    }
	}


