package javaproject;

import java.util.Scanner;

public class do_while_Demo {
	
	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter N: ");
		n=sc.nextInt();
		
		do
		
		{
			System.out.println("Jayshree");
			n=n-1;
			
		} while(n<0);
	}

}
