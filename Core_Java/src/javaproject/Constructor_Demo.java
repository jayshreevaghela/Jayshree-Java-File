package javaproject;

class Box
{
	double width,height,depth;
	Box()
	 {
		System.out.println("Default Constructor called");
		width=4;
		height=5;
		depth=6;
	 }
	
	Box(double w,double h,double d)
	{
		System.out.println("Parameterized Constructor called");
		width=w;
		height=h;
		depth=d;
	}
	
	Box(Box b)
	{
		System.out.println("Copy Constructor called");
		width=b.width;
		height=b.height;
		depth=b.depth;
	}
	
	void volume()            //------> User Define Function
	{
		System.out.println("Volume: "+(width*height*depth));
	}
	
}





public class Constructor_Demo {
	
	 public static void main(String[] args) {
		
		 Box b = new Box();            //------->Default Constructor
		 b.volume();
		 
		 Box b1 = new Box(5,6,7);      //------->Parameterized Constructor
		 b1.volume();
		 
		 Box b2 = new Box(b);          //------->Copy Constructor
		 b.volume();
	}

}
