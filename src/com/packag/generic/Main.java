package com.packag.generic;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		Store<String> store=new Store<>();
//		store.setItem("mukesh");
//		System.out.println(store.getItem());
        
		//Generic Types2
//		HashTable< String, Integer> ht=new HashTable<String, Integer>("mukesh", 27);
//		System.out.println(ht);
		
		//Generic Methods
//		GenericMethods genericMethod=new GenericMethods();
//		genericMethod.item("mukesh");
//		genericMethod.item(1);
//		genericMethod.item(2);
//		String[] array= {"muk","sing","kum"};
//		Integer[] arr={1,3,4};
//		genericMethod.item(array);		
		
		//Bound Type Parameter
//		System.out.println(BoundTypeParameter.compute(new Person("mukesh",27), new Person("alok", 28)));
//		System.out.println(BoundTypeParameter.compute("sti", "tush"));
		
		//Type Inference
		List<TypeInference<String>>list=new ArrayList<>();
		TypeInference.addStore("mukesh", list);
	
	}
}
