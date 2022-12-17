package com.exception;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		Checking_Account c = new Checking_Account(101, 1000);
		
	    Scanner sc = new Scanner(System.in);
	    double amount;
	    while(true)
	    {
	    	System.out.println("------------------------------------");
	    	System.out.println("1. Deposit");
	    	System.out.println("2. Withdraw");
	    	System.out.println("3. Check Balance");
	    	System.out.println("Exit");
	    	System.out.println("------------------------------------");
	    	
	    	System.out.print("Enter your Choice : ");
	    	int choice=sc.nextInt();
	    	System.out.println("------------------------------------");
	    	
	    	if(choice==1)
	    	{
	    		System.out.print("Enter Deposit Amount:");
	    		amount=sc.nextInt();
	    		c.deposit(amount);
	    		System.out.println("------------------------------------");
	    	}
	    	
	    	else if(choice==2)
	    	{
	    		try {
					System.out.print("Enter Withdrawal Amount: ");
					amount=sc.nextInt();
					c.withdraw(amount);
					System.out.println("------------------------------------");
				} catch (InSufficientFund e)
	    		{
					System.out.println("Sorry You Need Another "+e.getAmount()+" Rs. To Withdraw");	
					System.out.println("------------------------------------");
				}
	    	}
	    	
	    	else if(choice==3)
	    	{
	    		c.checkBalance();
	    		System.out.println("------------------------------------");
	    	}
	    	
	    	else 
	    	{
	    		System.out.println("Good By");
	    		System.out.println("------------------------------------");
	    		break;
	    	}
	    }
	}
}
