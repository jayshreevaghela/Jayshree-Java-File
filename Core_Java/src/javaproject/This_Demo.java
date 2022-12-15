package javaproject;

class Student
{
	int rno;
	String sname;
	
	public Student()
	
	{
		System.out.println("Default Constructor called");
	}
	
	
	public Student(int rno,String sname)
	
	{
		this();
		this.rno=rno;
		this.sname=sname;
	}

	void display()
	{
		System.out.println("Roll No: "+this.rno);
		System.out.println("Student Name: "+this.sname);
	}
	  

}

public class This_Demo {
	
	public static void main(String[] args) {
		
		Student s = new Student(1, "Jayshree");
		s.display();
	}

}
