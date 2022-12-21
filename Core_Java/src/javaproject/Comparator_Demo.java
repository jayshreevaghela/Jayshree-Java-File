package javaproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator_Demo implements Comparator<Employee>{

	
	public int compare(Employee e1, Employee e2) {
		int value=0;
		
		if(e1.getSalary()>e2.getSalary())
		{
			value=1;
		}
		else if(e1.getSalary()<e2.getSalary())
		{
			value=-1;
		}
		else if(e1.getSalary()==e2.getSalary())
		{
			value=0;
		}
		
		return value ;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		Employee e1=new Employee();
		e1.setEid(1);
		e1.setEname("Jayshree");
		e1.setSalary(25000);
		
		Employee e2=new Employee();
		e2.setEid(2);
		e2.setEname("Shraddha");
		e2.setSalary(30000);
		
		Employee e3=new Employee();
		e3.setEid(3);
		e3.setEname("Heer");
		e3.setSalary(18000);
		
		Employee e4=new Employee();
		e4.setEid(4);
		e4.setEname("Dhruvi");
		e4.setSalary(10000);
		
		Employee e5=new Employee();
		e5.setEid(5);
		e5.setEname("Shruti");
		e5.setSalary(8000);
	
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		Collections.sort(list, new Comparator_Demo());
		
		for(Employee e:list)
		{
			System.out.println("EID : "+e.getEid()+" ENAME : "+e.getEname()+" Salary : "+e.getSalary());
		}
		
		
		
	}
	
	  

}
