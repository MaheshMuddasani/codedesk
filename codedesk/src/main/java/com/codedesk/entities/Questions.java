package com.codedesk.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Question")
public class Questions {

	@Id
	@Column(name="qid")
	@SequenceGenerator(name="question_sequence",sequenceName="question_seq")
	private long qid;
	
	
	@Column(name="title")
	private String title;
	
	@Column(name="createddate")
	private Date createdate;
	
	@Column(name="qtag")
	private String qtag;
	
	@Column(name="qCategory")
	private String qCategory;
	
	@OneToMany(fetch=FetchType.EAGER)
	private List<Answers> answersList;
	
			
			
	public long getQid() {
		return qid;
	}

	public void setQid(long qid) {
		this.qid = qid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public String getQtag() {
		return qtag;
	}

	public void setQtag(String qtag) {
		this.qtag = qtag;
	}

	public String getqCategory() {
		return qCategory;
	}

	public void setqCategory(String qCategory) {
		this.qCategory = qCategory;
	}

	public List<Answers> getAnswersList() {
		return answersList;
	}

	public void setAnswersList(List<Answers> answersList) {
		this.answersList = answersList;
	}
	
	
}
