package javaproject;

import java.util.Scanner;

class A2
{
	int a;
	void getA2()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A2: ");
		a=sc.nextInt();
	}
	
	void putA2()
	{
		System.out.println("A2: "+a);
	}
}

class B2 extends A2
{
	int b;
	void getB2()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter B2: ");
		b=sc.nextInt();
	}
	
	void putB2()
	{
		System.out.println("B2: "+b);
	}
}

class C2 extends A2
{
	int c;
	void getC2()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter C2: ");
		c=sc.nextInt();
	}
	
	void putC2()
	{
		System.out.println("C2: "+c);
	}
}

public class Inheritance_Hierarchi_Demo {
	
	public static void main(String[] args) {
		
		B2 b2 = new B2();
		C2 c2 = new C2();
		
		b2.getA2();
		b2.getB2();
		c2.getC2();
		b2.putA2();
		b2.putB2();
		c2.putC2();
	}

}
