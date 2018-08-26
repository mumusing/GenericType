package com.packag.generic;

public class HashTable<T,K> 
{
  private T key;
  private K value;
  
  public HashTable(T key,K value)
  {
	// TODO Auto-generated constructor stub
	  this.key=key;
	  this.value=value;
  }
  @Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+this.key+" : "+this.value;
	}
}
