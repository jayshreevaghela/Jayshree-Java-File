package com.exception;

public class Checking_Account {
	
	int acno;
	double balance;
	
	public Checking_Account(int acno, double balance) {
		
		this.acno = acno;
		this.balance = balance;
	}
	
	 public void deposit(double amount)
	 {
		 this.balance=this.balance+amount;
	 }
	 
	 public void withdraw(double amount) throws InSufficientFund 
	  {
		 if(amount<=this.balance)
		 {
			 this.balance=this.balance-amount;
		 }
		 else
		 {
			 double needs =amount-this.balance;
			 throw new InSufficientFund(needs);
		 }
		
	}
	 
	 public void checkBalance() 
	 {
	      System.out.println("Current Balance : "+this.balance);
	}
}