package com.bptn.course._14_custom_exceptions._01_custom_execption_1;


// We often Extend either Exception class or RuntimeException class
public class InsufficientFundsException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	private double amount;
	
	public InsufficientFundsException(double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}

}
