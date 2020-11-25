package com.learning;

public class Order {
	private String orderId;
	private String Address;
	private String payment;
	private String email;
	
	public Order() {
		
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", Address=" + Address + ", payment=" + payment + ", email=" + email + "]";
	}

}
