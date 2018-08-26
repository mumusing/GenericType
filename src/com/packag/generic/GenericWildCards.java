package com.packag.generic;

import java.util.List;

public class GenericWildCards 
{
    /* List<? extends Number>---Upper Bound
     * 
     * Lower Bounds---We can add items to the list
     *  List<? super Integer>
     */
	
	public static void sum(List<? super Number>list)
	{
		//list.add(new Object());//will  not able to add
		list.add(new Integer(2));
		
	}
	
	
}
