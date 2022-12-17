package javaproject;

import java.util.Scanner;

public class Throw_Demo {
	
	public static void demo()
	{
		Scanner sc = new Scanner(System.in);
		
	   int x;
	   try {
		
		System.out.print("Enter X: ");
		x=sc.nextInt();
		
		if(x>0)
		{
			System.out.println("Square of "+x+" Is : "+(x*x));
		}
		
		else 
		{
			throw new Exception("Please Enter Positive Value Only");
		}
		
	 }catch(Exception e)
	   
	   {
			System.out.println(e);
			demo();
	   }
		
	}
	
	public static void main(String[] args) {
		
		demo();
		
	}

}


     
