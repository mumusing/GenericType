package com.packag.generic;

public class Circle implements Shape
{
   /* Upper Bounded WildCards "? extends T" 
    * Here T is an upper bound for wild card
    * List<? extends Number>  Here Number is upperBound for wild Card
    * 
    * 
    */
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("implements circle");
	}

}
