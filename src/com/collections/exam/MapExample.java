package com.collections.exam;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//     Map<String, Integer>map=new LinkedHashMap<>();
	 Map<String, Integer>map=new TreeMap<>();
     map.put("sds", 1);
     map.put("b", 2);
     map.put("c", 3);
     map.put("der", 4);
     map.put("e", 5);
     map.put("f", 6);
     
     for (Entry<String, Integer> entry : map.entrySet()) 
     {
		System.out.println(entry.getKey()+" : "+entry.getValue());
	 }
	}

}
