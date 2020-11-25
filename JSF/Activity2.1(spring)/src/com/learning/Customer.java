package com.learning;


public class Customer {
    private String firstName;
    private String middleName;
    private String lastName;
    private String dateofBirth;
    private String monthofBirth;
    private int yearofBirth;
    private String motherName;
    private String emailId;
    private String gender;
    private String maritalStatus;
    private String houseNo;
    private String streetName;
    private String state;
    private String city;
    private String pincode;
    private int phone;
    private int userName;
    private int password;
    
    public Customer() {
    }

	public Customer(String firstName, String middleName, String lastName, String dateofBirth, String monthofBirth,
			int yearofBirth, String motherName, String emailId, String gender, String maritalStatus, String houseNo,
			String streetName, String state, String city, String pincode, int phone, int userName, int password) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dateofBirth = dateofBirth;
		this.monthofBirth = monthofBirth;
		this.yearofBirth = yearofBirth;
		this.motherName = motherName;
		this.emailId = emailId;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
		this.phone = phone;
		this.userName = userName;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public String getMonthofBirth() {
		return monthofBirth;
	}

	public void setMonthofBirth(String monthofBirth) {
		this.monthofBirth = monthofBirth;
	}

	public int getYearofBirth() {
		return yearofBirth;
	}

	public void setYearofBirth(int yearofBirth) {
		this.yearofBirth = yearofBirth;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getUserName() {
		return userName;
	}

	public void setUserName(int userName) {
		this.userName = userName;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", dateofBirth=" + dateofBirth + ", monthofBirth=" + monthofBirth + ", yearofBirth=" + yearofBirth
				+ ", motherName=" + motherName + ", emailId=" + emailId + ", gender=" + gender + ", maritalStatus="
				+ maritalStatus + ", houseNo=" + houseNo + ", streetName=" + streetName + ", state=" + state + ", city="
				+ city + ", pincode=" + pincode + ", phone=" + phone + ", userName=" + userName + ", password="
				+ password + "]";
	}
}
