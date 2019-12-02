package com.cout.incognito.models;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "courses")
public class Courses {
	
	
	@Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Course_Id")
	private int crsId;
	@Column(name="Course_Name")
	private String crsName;
	@Column(name="Access_Code")
	private int accessCode;
    @OneToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "teacher_id")
	private User user;
    
    public Courses() {
    	
    }

	public Courses(User user, String crsName) {
		super();
		this.user = user;
		this.crsName = crsName;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}