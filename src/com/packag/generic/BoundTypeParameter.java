package com.packag.generic;

public class BoundTypeParameter {
	
	public static <T extends Comparable<T>> T compute(T t1, T t2)
	{
		if (t1.compareTo(t2)<0)
		{
			return t1;
		}
		return t2;
		
	}

	

}
