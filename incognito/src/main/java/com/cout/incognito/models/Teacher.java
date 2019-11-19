package com.cout.incognito.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="teachers")
																																																																		public class Teacher implements UserRole{
	
	@Override
	public String role() {
		return "teacher";
	}	
	@Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private int ID;
	@Column(name="NAME")
	private String NAME;
	@Column(name="EMAIL")
	private String EMAIL;
	@Column(name="password")
	private String password;
	@Column(name="is_enabled")
	private boolean isEnabled;
	@Column(name="role")
	private String role = this.role();
	
	public Teacher(){
		
	}

	public Teacher(int ID, String NAME, String EMAIL, String password, boolean isEnabled,String role) {
		super();
		this.ID = ID;
		this.NAME = NAME;
		this.EMAIL = EMAIL;
		this.password = password;
		this.isEnabled = false;
		this.role = role;
	}
	
	public void setNAME(String NAME) {
		this.NAME = NAME;
	}
	
	public String getNAME() {
		return NAME;
	}
	
	public void setEMAIL(String EMAIL) {
		this.EMAIL = EMAIL;
	}
	
	public String getEMAIL() {
		return EMAIL;
	}


	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	@Override
	public String toString() {
		return "Teacher [ID=" + ID + ", NAME=" + NAME + ", EMAIL=" + EMAIL +", password=" + password + "]";
	}
	public boolean isEnabled() {
		return isEnabled;
	}
	public void setEnabled(boolean isEnabled) {
		this.isEnabled = true;
	}	
}
