package javaproject;

import java.util.Scanner;

public class If_else_Condition_1 {
	
	public static void main(String[] args) {
		
		int a,b ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A: ");
		a=sc.nextInt();
		System.out.println("Enter B: ");
		b=sc.nextInt();
		
		if (a>b)
		{
			System.out.println("A id Max");
		}
		else
		{
			System.out.println("B is Max");
		}
	}

}
