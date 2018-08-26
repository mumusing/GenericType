package com.packag.generic;

public class GenericMethods 
{
//    public <T> void item(T item)
//    {
//    	System.out.println("Item"+item);
//    }
	public <T> void item(T[] items)
	{
		for (T t : items) 
		{
			System.out.println(t.toString()+" >");
		}
	}	
}
