package com.cout.incognito.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="questions")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="question_id")
	private int id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id",  nullable = true, insertable = true, updatable = false) 
	private User user;
	
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id",  nullable = true, insertable = true, updatable = false)
    private Courses course;
    
	@Column(name="QUESTION")
	private String QUESTION;
	
	@Column(name="ANSWER")
	private String ANSWER;
	
	@Column(name="isAnswered")
	private boolean is_answered;
	
	public Question(){
		
	}
	
	public Question(Courses course, User user) {
		super();
		this.course = course;
		this.user = user;
		is_answered = false;
	}

	public Question( User user, Courses course, String qUESTION) {
		super();
		this.user = user;
		this.course = course;
		QUESTION = qUESTION;
		is_answered = false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Courses getCourse() {
		return course;
	}

	public void setCourse(Courses course) {
		this.course = course;
	}

	public String getQUESTION() {
		return QUESTION;
	}

	public void setQUESTION(String qUESTION) {
		QUESTION = qUESTION;
	}

	public String getANSWER() {
		return ANSWER;
	}

	public void setANSWER(String aNSWER) {
		ANSWER = aNSWER;
	}

	public boolean isIs_answered() {
		return is_answered;
	}

	public void setIs_answered(boolean is_answered) {
		this.is_answered = is_answered;
	}
	
}
