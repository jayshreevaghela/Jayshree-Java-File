package javaproject;

public class Static_Method_Demo {
	
	static int a=10;
	static int b;
	static void math(int X)
	{
		System.out.println("X : "+X);
		System.out.println("A : "+a);
		System.out.println("B : "+b);
	}
	
	static                          // --------> Static Block
	{
		System.out.println("Static Block Initialized");
		b=a*4;
	}
	public static void main(String[] args) {
		math(12);
		
	}

}
          

        