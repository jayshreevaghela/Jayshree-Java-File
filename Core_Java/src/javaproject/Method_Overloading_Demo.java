package javaproject;

public class Method_Overloading_Demo {
	
	void test()
	{
		System.out.println("Test with no Argument");
	}
	
	void test(int a)
	{
		System.out.println("Test with One Argument");
	}
	
	void Test(int a, int b)
	{
		System.out.println("Test with Two Argument");
	}

	public static void main(String[] args) {
		 
		Method_Overloading_Demo m = new Method_Overloading_Demo();
		
		m.test();
		m.test(10);
		m.Test(10,20);
		
	}
}
