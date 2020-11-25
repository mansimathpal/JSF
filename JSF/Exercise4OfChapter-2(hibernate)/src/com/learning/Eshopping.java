package com.learning;

public class Eshopping {
	private String FirstName;
	private String LastName;
	private String DeliveryAddress;
	private int OfferCode;
	private int ContactNumber;
	private String Comments;
	private String PaymentMode;
	
    public Eshopping() {
	}

	public Eshopping(String firstName, String lastName, String deliveryAddress, int offerCode, int contactNumber,
			String comments, String paymentMode) {
		this.FirstName = firstName;
		this.LastName = lastName;
		this.DeliveryAddress = deliveryAddress;
		this.OfferCode = offerCode;
		this.ContactNumber = contactNumber;
		this.Comments = comments;
		this.PaymentMode = paymentMode;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getDeliveryAddress() {
		return DeliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		DeliveryAddress = deliveryAddress;
	}

	public int getOfferCode() {
		return OfferCode;
	}

	public void setOfferCode(int offerCode) {
		OfferCode = offerCode;
	}

	public int getContactNumber() {
		return ContactNumber;
	}

	public void setContactNumber(int contactNumber) {
		ContactNumber = contactNumber;
	}

	public String getComments() {
		return Comments;
	}

	public void setComments(String comments) {
		Comments = comments;
	}

	public String getPaymentMode() {
		return PaymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		PaymentMode = paymentMode;
	}

	@Override
	public String toString() {
		return "Eshopping [FirstName=" + FirstName + ", LastName=" + LastName + ", DeliveryAddress=" + DeliveryAddress
				+ ", OfferCode=" + OfferCode + ", ContactNumber=" + ContactNumber + ", Comments=" + Comments
				+ ", PaymentMode=" + PaymentMode + "]";
	}
}
