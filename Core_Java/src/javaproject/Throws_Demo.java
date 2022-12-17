package javaproject;

import java.util.InputMismatchException;
import java.util.Scanner;

	public class Throws_Demo {
		
		public static void demo() throws ArithmeticException ,InputMismatchException,IndexOutOfBoundsException
		{
			Scanner sc = new Scanner(System.in);
			
		   int x;
		   
			System.out.print("Enter X: ");
			x=sc.nextInt();
			
			if(x>0)
			{
				System.out.println("Square of "+x+" Is : "+(x*x));
			}
			
			else 
			{
				throw new ArithmeticException("Please Enter Positive Value Only");
			}
			
		}
		
		public static void main(String[] args) {
			
			try {
				demo();
			}catch(Exception e)
			  {
				System.out.println(e);
			  }
			
			
		}

	}


