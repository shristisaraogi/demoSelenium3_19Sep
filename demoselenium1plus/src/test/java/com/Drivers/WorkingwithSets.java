package com.Drivers;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WorkingwithSets {

	public static void main(String[] args) {
	
		Set<Object> s=new HashSet<Object>();
				s.add("A");
		        s.add("B");
		        s.add("C");
		        s.add("D");
		        s.add("E");
		        
		        System.out.println(s.size());
		        
		        Iterator<Object> itr= s.iterator();
		        
		        for(Object el:s)
		        {
		        System.out.println(itr.next());  
		        }  
		        
	}

}
