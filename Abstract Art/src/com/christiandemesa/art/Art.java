package com.christiandemesa.art;

public abstract class Art {

	// Member variables
	private String title;
	private String author;
	private String description;
	
	// Constructor
	public Art(String title, String author, String description) {
		this.title = title;
		this.author = author;
		this.description = description;
	}
	
	// Abstract method
	public abstract void viewArt();
	
	// title getter
	public String getTitle() {
		return title;
	}
	
	// title setter
	public void setTitle(String title) {
		this.title = title;
	}
	
	// author getter
		public String getAuthor() {
			return author;
	}
		
	// author setter
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// description getter
	public String getDescription() {
		return description;
	}
	
	// description setter
	public void setDescription(String description) {
		this.description = description;
	}
	
}
