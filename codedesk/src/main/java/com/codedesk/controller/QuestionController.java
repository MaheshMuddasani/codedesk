package com.codedesk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.codedesk.entities.Questions;
import com.codedesk.services.Questionservice;

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private Questionservice questionservice;
	
	@RequestMapping("/all")
	@ResponseBody
	public List<Questions> getAllQuestions(){
		return questionservice.getAllQuestions();
	}
	
	@RequestMapping(value="/addQ", method = RequestMethod.POST)
	public void addQuestion(@RequestBody Questions question){
		questionservice.addQuestion(question);
	}
}
