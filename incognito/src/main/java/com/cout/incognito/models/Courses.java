package com.cout.incognito.models;



import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "courses")
public class Courses {
	
	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Course_Id")
	private int crsId;
	
	@Column(name="Course_Name")
	private String crsName;
	
	@Column(name="Access_Code")
	private int accessCode;
    

	@ManyToMany
	@JoinTable(name="userCourse", joinColumns=@JoinColumn(name="course_id"),
	  inverseJoinColumns = @JoinColumn(name="user_id")) 
	private List<User> user;
    
	@OneToMany(mappedBy="course")
    private List<Question> question;
    
    
	public Courses() {
    	
    }

	public Courses(String crsName, int accessCode, List<User> user) {
		super();
		this.crsName = crsName;
		this.accessCode = accessCode;
		this.user = (List<User>) user;
	}

	public int getCrsId() {
		return crsId;
	}

	public void setCrsId(int crsId) {
		this.crsId = crsId;
	}

	public String getCrsName() {
		return crsName;
	}

	public void setCrsName(String crsName) {
		this.crsName = crsName;
	}

	public int getAccessCode() {
		return accessCode;
	}

	public void setAccessCode(int accessCode) {
		this.accessCode = accessCode;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	public List<Question> getQuestion() {
		return question;
	}

	public void setQuestion(List<Question> question) {
		this.question = question;
	}

    
	
	
	
}