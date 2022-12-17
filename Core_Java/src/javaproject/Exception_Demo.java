package javaproject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Demo {
	
	public static void main(String[] args) {
		
		int a,b,c;
		
		System.out.println("Start Code");
		try {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A: ");
		a=sc.nextInt();
		System.out.print("Enter B: ");
		b=sc.nextInt();
		
		c=a/b;
		
		System.out.println("Division: "+c);
		
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Exception Caught "+e);
		}
		catch(InputMismatchException e)
		{
			 System.out.println("Exception Caught "+e);
		}
		
		System.out.println("End Code");
		
			
	}
	
}


