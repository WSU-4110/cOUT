package com.cout.incognito.models;

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
@Table(name = "Course")
public class Course {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int CrsId;
	
	private String CrsName;
	private int AccessCode;

    @OneToOne(targetEntity = Teacher.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "teacher_id")
    private Teacher teacher;
    
	public Course() {}
    public Course( int CrsId, String CrsName, int AccessCode, Teacher teacher)
    {
    	super();
    	this.CrsId = CrsId;
    	this.CrsName = CrsName;
    	this.AccessCode = AccessCode;
    	this.teacher = teacher;
    }
    
    public void setCrsId(int CrsId) {
		this.CrsId = CrsId;
	}
	
	public int getCrsId() {
		return CrsId;
	}
	
	public void setCrsName(String CrsName) {
		this.CrsName = CrsName;
	}
	
	public String getCrsName() {
		return CrsName;
	}
	
	public int getAccessCode() {
		return AccessCode;
	}
	public void setAccessCode(int AccessCode) {
		this.AccessCode = AccessCode;
	}
	
    public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	
}

