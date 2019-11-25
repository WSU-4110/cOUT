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
@Entity
@Table(name = "courses")
public class Courses {
	public Courses() {}
	@Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Course_Id")
	private String CrsId;
	
	@Column(name="Course_Name")
	private String CrsName;
	@Column(name="Access_Code")
	private int AccessCode;
	@Column(name = "teacher")
	private String teacher;
	
    //@OneToOne(targetEntity = Teacher.class, fetch = FetchType.EAGER)
    //@JoinColumn(nullable = false, name = "teacher_id", referencedColumnName = "id")
    //private Teacher teacher;
    
    public Courses(String teacher, String CrsId, String CrsName, int AccessCode)
    {
    	this.CrsId = CrsId;
    	this.AccessCode = AccessCode;
    	this.CrsName = CrsName;
    	this.teacher = teacher;
    }
    
    public void setCrsId(String CrsId) {
		this.CrsId = CrsId;
	}
	
	public String getCrsId() {
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
	public void AccessCode(int AccessCode) {
		this.AccessCode = AccessCode;
	}
	
    public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Courses [Course_Id=" + CrsId + ", Course_Name=" + CrsName + ", Access_Code=" + AccessCode +", teacher=" + teacher + "]";
	}
}

