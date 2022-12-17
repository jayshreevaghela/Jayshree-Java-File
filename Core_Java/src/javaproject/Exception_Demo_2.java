package javaproject;

import java.util.Scanner;


public class Exception_Demo_2 {
	
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
			

			 int arr[] = {1,2,3,4,5};
			 System.out.print("Enter Index Number : ");
			 int index=sc.nextInt();
			 System.out.println("Data : "+arr[index]);
		
			}
			catch(Exception e)
			{
				System.out.println("Exception Caught "+e);
			}
			
		   System.out.println("End Code");
			
					
		}
		
	}


