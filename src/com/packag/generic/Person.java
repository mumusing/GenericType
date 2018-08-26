package com.packag.generic;

public class Person implements Comparable{

	private String name;
	private int age;
    public Person(String name,int age) 
    {
		// TODO Auto-generated constructor stub
    	this.name=name;
    	this.age=age;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return this.name.compareTo(((Person)arg0).getName());
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}
