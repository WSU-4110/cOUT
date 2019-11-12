package com.cout.incognito.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="questions")
public class Question {
	

	@Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private int ID;
	@Column(name="QUESTION")
	private String QUESTION;
	
	public Question(){
		
	}
	public Question(int iD, String question) {
		super();
		ID = iD;
		QUESTION = question;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getQUESTION() {
		return QUESTION;
	}
	public void setQUESTION(String question) {
		QUESTION = question;
	}
	@Override
	public String toString() {
		return "Question [ID=" + ID + ", QUESTION=" + QUESTION + "]";
	}
	
}
