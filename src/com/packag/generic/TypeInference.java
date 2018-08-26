package com.packag.generic;

import java.util.List;

public class TypeInference<T> 
{
    private T item;
    public T getItem()
    {
    	return this.item;
    }
    public void setItem(T item)
    {
    	this.item=item;
    }
	public static <T> void addStore(T t,List<TypeInference<T>> list)
	{
		TypeInference<T> bucket=new TypeInference<>();
		bucket.setItem(t);
		list.add(bucket);
		System.out.println(t.toString());
		
	}
	
	
}
