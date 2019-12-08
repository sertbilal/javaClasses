package com.class31;

public class Account {
	
	private long accountNumber;
	private double balance;
	//getters
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	//setter
	public void setBalance(int amount) {	
		if (amount>0) {
			balance=balance+amount;
		}	
	}
	public void setAccountNumber(long accountNumber) {
		if (String.valueOf(accountNumber).length()==9) {
			this.accountNumber=accountNumber;
		}
	}
}
