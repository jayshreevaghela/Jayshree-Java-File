package javaproject;

import java.util.Scanner;

class A1
{
	
    int a;
    void getA()
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter A1 :");
    	a=sc.nextInt();
    }
    void putA()
    {
    	System.out.println("A1: "+a);
    }
}

class B1 extends A1
{
	int b;
	void getB()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter B1:");
		b=sc.nextInt();
	}
	void putB()
	{
		System.out.println("B1: "+b);
	}
}

class C1 extends B1
{
	int c;
	void getC()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter C1 :");
		c=sc.nextInt();
	}
	void putC()
	{
		System.out.println("C1: "+c);
	}
}

public class Inheritance_Multilevel_Demo {
	
	public static void main(String[] args) {
		
		C1 c = new C1();
		
		c.getA();
		c.getB();
		c.getC();
		c.putA();
		c.putB();
		c.putC();
		
	}

}
