package javaproject;

import java.util.Scanner;

public class for_loop_1 {
	
	public static void main(String[]args) {
		
		int i, n, Sum=0 ;
		 Scanner sc = new Scanner (System.in);
		 
		 System.out.println("Enter N: ");
		 n= sc.nextInt();
		 
		 for(i=1;i<=n;++i)
		 {
			 Sum = Sum+i;
			 
		 }
		 System.out.println("Sum: "+Sum);
	}

}
