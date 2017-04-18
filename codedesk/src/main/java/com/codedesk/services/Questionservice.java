package com.codedesk.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codedesk.dao.IQuestionsDao;
import com.codedesk.entities.Questions;

@Service
public class Questionservice implements IQuestionService{

	@Autowired
	private IQuestionsDao questionDao;
	@Override
	public List<Questions> getAllQuestions() {
		// TODO Auto-generated method stub
		return questionDao.getAllQuestions();
	}

	@Override
	public void addQuestion(Questions question) {
		// TODO Auto-generated method stub
		questionDao.addQuestion(question);
	}

}
