package com.collections.exam;

public class Book implements Comparable<Book>{
	private String authorName;
	private String Title;
	private int numPages;

	public Book(String authorName, String title, int numPages) {
		super();
		this.authorName = authorName;
		Title = title;
		this.numPages = numPages;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
	//	return this.authorName.compareTo(o.getAuthorName());
    //	return Integer.compare(this.numPages, o.numPages);
     if (this.numPages>o.numPages) return +1;
     if( this.numPages==o.numPages)return 0;
     else return -1;
     
	}
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return this.authorName+" :"+this.Title+" : "+this.numPages;
    }
}
