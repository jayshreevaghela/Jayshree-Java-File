package javaproject;

import java.util.Scanner;

public class ladder_if_demo {
	
	public static void main(String[]args) {
		
		int rno,S1,S2,S3,total;
		double per;
		String name;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter rno: ");
		rno= sc.nextInt();
		System.out.println("Enter Student Name: ");
		name= sc.next();
		System.out.println("Enter Marks of Subject1: ");
	    S1= sc.nextInt();
	    System.out.println("Enter Marks of Subject2: ");
	    S2=sc.nextInt();
	    System.out.println("Enter Marks of Subject3: ");
	    S3=sc.nextInt();
	    
	    total = S1+S2+S3;
	    per = total/3;
	    
	    System.out.println("Student Name: "+name);
	    System.out.println("Roll No: "+rno);
	    System.out.println("Total: "+total);
	    System.out.println("Percentage: "+per);
	    
	    if (per>=70)
	    {
	    	System.out.println("Distinction");
	    }
	   else if (per>=60)
	    {
	    	System.out.println("First Class");
	    }
	    else if (per>=50)
	    {
	    	System.out.println("Second Class");
	    }
	   else if (per>=40)
	    {
	    	System.out.println("Pass Class");
	    }
	    else
	    {
	    System.out.println("Fail");	
	    }
	    
	    
	}   

}
