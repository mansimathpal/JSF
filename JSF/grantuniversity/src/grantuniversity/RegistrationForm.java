package grantuniversity;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
@ManagedBean
@RequestScoped
public class RegistrationForm {
	private String firstName;
	private String lastName;
	private String gender;
	private String address;
	private String contactNumber;
	private String emailId;
	private String userId;
	private String password;
	private String confirmPassword;
	

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	public void validateEmail(FacesContext fc, UIComponent c, Object value)throws ValidatorException{
	String email = (String)value;
	Pattern mask = null;
	mask = Pattern.compile(".+@.+\\.[a-z]+");
	Matcher matcher = mask.matcher(email);
	if(!matcher.matches()) {
		FacesMessage message = new FacesMessage();
		message.setDetail("Invalid e-mail Id");
		message.setSummary("Invaild e-mail Id");
		throw new ValidatorException(message);
	}
		
	}
}


