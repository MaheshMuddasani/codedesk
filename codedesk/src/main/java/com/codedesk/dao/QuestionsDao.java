package com.codedesk.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.codedesk.entities.Questions;
@Transactional
@Repository
public class QuestionsDao implements IQuestionsDao{

	@Autowired
	private HibernateTemplate hTemplate;
	
	@Override
	public List<Questions> getAllQuestions() {
		// TODO Auto-generated method stub
		String hql = "FROM Questions as p ORDER BY p.qid";
		return (List<Questions>) hTemplate.find(hql);
	}

	@Override
	public void addQuestion(Questions question) {
		// TODO Auto-generated method stub
		hTemplate.save(question);
	}

}
