package javaproject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap_Demo {
	
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		
		map.put(1, "Jayshree");
		map.put(2, "Shraddha");
		map.put(3, "Heer");
		map.put(4, "Dhruvi");
		map.put(5, "Shruti");
		map.put(6, "Dhruvisha");
		
		System.out.println(map);
		System.out.println(map.get(3));
		System.out.println(map.get("Jayshree"));
		System.out.println(map.remove(6));
	    System.out.println(map);
	    
	    Set set=map.entrySet();
	    Iterator itr=set.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    
	    
	    
	    
	}
	

}
