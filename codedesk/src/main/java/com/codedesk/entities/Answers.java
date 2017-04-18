package com.codedesk.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table
public class Answers {
	
	@Id
	@Column(name="aid")
	@SequenceGenerator(name="answer_seq",sequenceName="answer_seq")
	private int id;
	
	
	@Column(name="answer")
	private String answer;
	
	@Column(name="createddate",columnDefinition="Default Sysdate")
	private Date createddate;
	
	@Column(name="question_id")
	private String questionid;
	
	@Column(name="likes")
	private String likes;
	
	@Column(name="correct")
	private boolean correct;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public String getQuestionid() {
		return questionid;
	}

	public void setQuestionid(String questionid) {
		this.questionid = questionid;
	}

	public String getLikes() {
		return likes;
	}

	public void setLikes(String likes) {
		this.likes = likes;
	}

	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}
	
	

}
