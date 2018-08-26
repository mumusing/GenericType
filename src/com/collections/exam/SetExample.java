package com.collections.exam;

import java.util.HashSet;
import java.util.Set;

public class SetExample 
{
	
 
 public void hashSet()
 {
	 Set<String>set=new HashSet<>();
	 set.add("muk");
	 set.add("sing");
	 set.add("rude");
	 set.add("null");
	 for (String string : set) {
		System.out.println(string);
	}
	 
 }
}
