package com.collections.exam;

import java.util.Comparator;

public class BookComparator implements Comparator<Book>{

	

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getNumPages(), o2.getNumPages());
	}

}
