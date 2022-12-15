package javaproject;

import java.util.Scanner;

public class While_Demo_1 {
	
	public static void main(String[] args) {
		
		int n,sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter N: ");
        n=sc.nextInt();
        
		while(n>0)
			
		{
			sum = sum+n;
			n=n-1;   // n-- //
		}
		System.out.println("Sum: "+sum);
		
		
		
	}

}
