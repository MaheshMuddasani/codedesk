package com.codedesk.services;

import java.util.List;

import com.codedesk.entities.Questions;

public interface IQuestionService {

	List<Questions> getAllQuestions();
	void addQuestion(Questions question);
	
	
}
