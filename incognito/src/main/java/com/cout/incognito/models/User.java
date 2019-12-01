package com.cout.incognito.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Constraint;
import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;
import javax.persistence.*;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="users")
public class User{

	@Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private int ID;
	@Column(name="NAME")
	private String NAME;
	@Pattern(regexp =  ".*@wayne.edu", message = "Please enter a Wayne State email")
	@Column(name="email") 
	private String EMAIL;
	@Column(name="password")
	private String password;
	@Column(name="is_enabled")
	private boolean isEnabled;
    @Column(name="role")
    private String role;

	public User(int iD, String nAME, String eMAIL, String password, boolean isEnabled, String role) {
		super();
		ID = iD;
		NAME = nAME;
		EMAIL = eMAIL;
		this.password = password;
		this.isEnabled = isEnabled;
		this.role = role;
	}

	public User(){
		
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [ID=" + ID + ", NAME=" + NAME + ", EMAIL=" + EMAIL + ", password=" + password + ", isEnabled="
				+ isEnabled + ", role=" + role + "]";
	}
	
	
	
}