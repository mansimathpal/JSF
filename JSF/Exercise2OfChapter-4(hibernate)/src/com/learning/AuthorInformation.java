package com.learning;

import java.util.Date;

public class AuthorInformation {
	private int authorId;
	private String authorName;
	private String authorspenName;
	private String gender;
	private Date dateofBirth;
	private String Address;
	private int contactNumber;
	private String emailId;
	private String Nationlity;
	
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorspenName() {
		return authorspenName;
	}
	public void setAuthorspenName(String authorspenName) {
		this.authorspenName = authorspenName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(Date dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getNationlity() {
		return Nationlity;
	}
	public void setNationlity(String nationlity) {
		Nationlity = nationlity;
	}
}
