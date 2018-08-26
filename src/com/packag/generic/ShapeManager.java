package com.packag.generic;

import java.util.List;

public class ShapeManager 
{
public static void drawAll(List<? extends Shape>list)
{
	for (Shape shape : list)
	{
		shape.draw();
	}
}
public static void addNum(List<? extends Number>list)
{
	double sum=0;
	for (Number number : list)
	{
		sum+=number.doubleValue();
	}
}
}
