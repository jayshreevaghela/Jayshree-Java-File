package javaproject;

interface RBI
{
	void roi(double r);
}

class SBI implements RBI
{

	public void roi(double r)
	{
        System.out.println("SBI Rate of interest : "+r);

	} 
		
}

class BOB implements RBI
{
	public void roi(double r) 
	
	{
		System.out.println("BOB Rate of interest : "+r);
		
	}
	
}

public class Interface_Demo_1 {
	
	public static void main(String[] args) {
		
		BOB b = new BOB();
		b.roi(5.6);
		
		SBI s = new SBI();
		s.roi(5.5);
	}

}
