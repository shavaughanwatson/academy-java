package com.bptn.course._14_custom_exceptions._01_custom_execption_1;

public class BankAccount{
	double balance;
	String accountNumber;
	
	

	public BankAccount(double balance, String accountNumber) {
		super();
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	
	public void withdraw(double amount) throws InsufficientFundsException  {
		
		if(amount > balance) {
			double needs = amount - balance;
			
			throw new InsufficientFundsException(needs);
		}
		
		balance -= amount; //balance = balance - amount;
		
		System.out.println("Withdrawl of S" + amount + "successful. New balnce $" + balance);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
