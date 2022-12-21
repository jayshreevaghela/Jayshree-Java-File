package javaproject;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashSet_Demo {
	
	public static void main(String[] args) {
		
		HashSet set= new HashSet();
		
		set.add(10);
		set.add(10.10);
		set.add("tops");
		set.add('t');
		set.add(true);
		set.add(null);
		set.add(10);
		
	    System.out.println(set);
	    
	    
	    
	}

}
