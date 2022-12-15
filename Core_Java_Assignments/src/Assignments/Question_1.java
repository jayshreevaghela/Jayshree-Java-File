package Assignments;

import java.util.Scanner;

public class Question_1 {
	
	public static void main(String[] args) {
		
		 int a,b,c;
		    
		  Scanner sc = new Scanner(System.in);
		   
		  System.out.print("Enter the 1st number: ");
		  a= sc.nextInt();
		   
		  System.out.print("Enter the 2nd number: ");
		  b= sc.nextInt();
		   
		  System.out.print("Enter the 3rd number: ");
		  c= sc.nextInt();
		   
		   
		  if (a > b && a > c )
			  
		  {
			  System.out.println("The greatest Number is: "+a);
		  }
		    
		   
		  if (b > a && b > c)
			  
		  {
			  System.out.println("The greatest Number is: "+b); 
		  }
		   
		  else
			  
		  {
			  System.out.println("The greatest Number is: "+c);
		  }
		   
		  
		    
		 }
		
		
	}

	
		
		

		    
		    
		  
		    
		 
