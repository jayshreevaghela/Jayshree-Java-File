package javaproject;

class P1
{
	P1()
	{
		System.out.println("P1 Default Constructor");
	}
	void show()
	{
		System.out.println("Show From P1");
	}
}

class P2 extends P1
{
	P2()
	{
		System.out.println("P2 Default Constructor");
	}
	void show()
	{
		super.show();
		System.out.println("Show From P2");
	}
}

class P3 extends P2                                      //Method Overriding---->Run-time Polymorphism 
{
	P3()
	{
		System.out.println("P3 Default Constructor");
	}
	void show()
	{
		super.show();
		System.out.println("Show From P3");
	}
}



public class Constructor_Chaining_Demo {
	
	public static void main(String[] args) {
		
		P3 p = new P3();
		p.show();
		
		
	}

}
