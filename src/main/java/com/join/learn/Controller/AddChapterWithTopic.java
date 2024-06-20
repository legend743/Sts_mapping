package com.join.learn.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.join.learn.Entity.ChapterWiseNotes;
import com.join.learn.QuestionDTO.ChapterwithTopicDTO;
import com.join.learn.Service.ChapterWiseService;

@RestController
@RequestMapping("/chapter")
public class AddChapterWithTopic {
	@Autowired
	private ChapterWiseService chapterservice;
	@PostMapping("/topic")
	public String AddChapterTopic(@RequestBody ChapterwithTopicDTO chapterDto){
		try{
			chapterservice.addChapterToic(chapterDto);
			return "successfull";
			
		}catch(Exception e) {
return "error";
		}
		
	}

}
