package com.learning.hibernate.model;

public class Course {
	private int id;
	private String cousreName;
	private double durtion;
	private double price;
	private String faculty;
	private String qualification;
	
	public Course() {}

	public Course(int id, String cousreName, double durtion, double price, String faculty, String qualification) {
		super();
		this.id = id;
		this.cousreName = cousreName;
		this.durtion = durtion;
		this.price = price;
		this.faculty = faculty;
		this.qualification = qualification;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCousreName() {
		return cousreName;
	}

	public void setCousreName(String cousreName) {
		this.cousreName = cousreName;
	}

	public double getDurtion() {
		return durtion;
	}

	public void setDurtion(double durtion) {
		this.durtion = durtion;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", cousreName=" + cousreName + ", durtion=" + durtion + ", price=" + price
				+ ", faculty=" + faculty + ", qualification=" + qualification + "]";
	}
	
	

}
