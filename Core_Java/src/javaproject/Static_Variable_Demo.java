package javaproject;

import java.util.Scanner;

public class Static_Variable_Demo {
	
	static int a;
	void setValue()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A: ");
		a=sc.nextInt();
	}
	
	void putValue()
	{
		System.out.println("A: "+a);
	}

	public static void main(String[] args) {
		
		Static_Variable_Demo s1 = new Static_Variable_Demo();
		Static_Variable_Demo s2 = new Static_Variable_Demo();
		Static_Variable_Demo s3 = new Static_Variable_Demo();
		
		s1.setValue();
		s2.setValue();
		s3.setValue();
		
		s1.putValue();
		s2.putValue();
		s3.putValue();
		
	}
}
