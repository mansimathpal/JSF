package com.learning.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student_Passport")
public class Passport {
	// Attribute level annotation
	@Id
	@Column(name ="passport_id")
	@GeneratedValue
	private int id;
	private String authority;
	private String passportNumber;
	
	//default constructor
	
	public Passport() {}
	// paramaterized constructor
    public Passport(String authority, String passportNumber) {
		super();
		this.authority = authority;
		this.passportNumber = passportNumber;
	}
	// getters and setters method
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		passportNumber = passportNumber;
	}
	@Override
	public String toString() {
		return "Passport [id=" + id + ", authority=" + authority + ", PassportNumber=" + passportNumber + "]";
	}
}
