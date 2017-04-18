package com.codedesk.dao;

import java.util.List;

import com.codedesk.entities.Questions;

public interface IQuestionsDao {
	List<Questions> getAllQuestions();
	void addQuestion(Questions question);
	

}
