package javaproject;

import java.util.Scanner;

public class Array_Demo {
	
	public static void main(String[] args) {
		
		int a[] = new int[5];
		int i;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Array Elements");
		
		for(i=0;i<a.length;i++)
		{
			System.out.print("Enter "+i+" Element : ");     //  "+(i+1)+"  //
			a[i]=sc.nextInt();
		}
		
		System.out.println("Array Elements Are");
		
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"] = "+a[i]);
		}
	}

}
