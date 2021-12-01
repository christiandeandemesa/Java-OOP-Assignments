package com.christiandemesa.art;

public class Painting extends Art {

	// Member variable
	private String paintType;
	
	// Constructor
	public Painting(String title, String author, String description, String paintType) {
		super(title, author, description);
		this.paintType = paintType;
	}
	
	// Abstract Method
	public void viewArt() {
		String painting = "";
		painting += String.format("Title: %s\n", getTitle());
		painting += String.format("Author: %s\n", getAuthor());
		painting += String.format("Description: %s\n", getDescription());
		painting += String.format("Paint Type: %s\n", getPaintType());
		System.out.println(painting);
	}
	
	// paintType getter
	public String getPaintType() {
		return paintType;
	}
	
	// paintType setter
	public void setPaintType() {
		this.paintType = paintType;
	}
	
}
