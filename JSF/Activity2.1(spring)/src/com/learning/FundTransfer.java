package com.learning;

public class FundTransfer {
	private double amount;
	
	public FundTransfer() {
		
	}

	public FundTransfer(double amount) {
		super();
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "FundTransfer [amount=" + amount + "]";
	}
}
