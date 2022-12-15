package javaproject;

import java.util.Scanner;

public class SwitchCase_Demo_1 {
	
	public static void main(String[] args) {
		
		
        int a,b,c,d;
		
		Scanner sc = new Scanner(System.in);
		boolean flag= true;
		do {
		
		System.out.println("Enter A: ");
		a=sc.nextInt();
		System.out.println("Enter B: ");
		b=sc.nextInt();
		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Exit");
		System.out.println("Enter Your Choice: ");
		d=sc.nextInt();
		
		switch(d)
		
		   {
		       case 1:
		    	   c=a+b;
		    	   System.out.println("Addition: "+c);
		    	   break;
		    	   
		       case 2: 
		           c=a-b;
		           System.out.println("Subtraction: "+c);
		           break;
		           
		       case 3: 
		           c=a*b;
		           System.out.println("Multiplication: "+c);
		           break;    
		        
		       case 4: 
		           c=a/b;
		           System.out.println("Division: "+c);
		           break; 
		           
		       case 5:
		    	   flag=false;
		    	   System.out.println("Exit");
		    	   break;
		           
		       default:
		    	    System.out.println("Invalid Choice");
		    	    break;
		           
		   } 
		
		}while(flag);
			
	}

}
