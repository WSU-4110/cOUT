package com.cout.incognito.models;

import javax.validation.Constraint;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int ID;
	
	@NotNull(message = "Field cannot be null")
	@Column(name = "NAME")
	private String NAME;
	
	@Length(max = 50)
	@Pattern(regexp = ".*@wayne.edu", message = "Please enter a Wayne State email")
	@NotNull(message = "Field cannot be null")
	@Column(name = "EMAIL")
	private String EMAIL;

	@NotNull(message = "Field cannot be null")
	@Column(name = "password")
	private String password;
	
	@Column(name = "is_enabled")
	private boolean isEnabled;
	
	@Column(name = "role")
	private String role;
	
	@ManyToMany(mappedBy= "user")
    private List<Courses> course;
	
	  
	@OneToMany(mappedBy="user")
	private List<Question> questions; 

	public User(int iD, String nAME, String eMAIL, String password, boolean isEnabled, String role) {
		super();
		ID = iD;
		NAME = nAME;
		EMAIL = eMAIL;
		this.password = password;
		this.isEnabled = isEnabled;
		this.role = role;
	}

	public User() {

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