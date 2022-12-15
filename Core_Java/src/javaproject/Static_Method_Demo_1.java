package javaproject;

public class Static_Method_Demo_1 {
	

	static int a=10;
	static int b;
	
	{
	   System.out.println("Block 1");	
	}
	
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
	{
		System.out.println("Block 2");
	}
	public static void main(String[] args) {
		
		Static_Method_Demo_1 s = new Static_Method_Demo_1();        //---> Normal Block call--Object Created
	     
	    math(12);
	    
	}

}
          


